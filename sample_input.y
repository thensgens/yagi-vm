fluent on;
on = {1, 2, 3};
on
fluent off;
off = on;
$n = 1;
$m = 2;

action myFoo($foo, $bar) precondition: $foo > $bar effect: on -= {2,3}; end action
myFoo($n, $m, 1)
on