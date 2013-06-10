fluent currFloor;
currFloor = {4};

fluent on;
on = {3, 5};

action turnoff($n)
	precondition:
		$n in on
	effect:
		on -= {$n};
	signal:
		"Turn-off button at floor " + $n
end action

fact floors;
floors = {1, 2, 3, 4, 5, 6};

action up($n)
	precondition:
		exists $i in floors
		such currFloor == {$i} and $i < $n
	effect:
		currFloor = {$n};
	signal:
		"Move up to floor " + $n
end action

action open()
	signal:
		"Open elevator door"
end action

proc goto($n)
	if currFloor != {$n} then
		choose
			up($n);
		or
			down($n);
		end choose
	end if
end proc

proc serve($n)
	goto($n);
	turnoff($n);
	open();
	close();
end proc

proc serveafloor()
	pick $n from on such
		serve($n);
	end pick
end proc
