fluent on;
on = {1, 2, 3};
fluent off;
off = on;
$n = 1;
$m = 2;

action simple($foo, $bar) precondition: $foo != $bar effect: on += {4}; end action
action argumentMismatch($foo, $bar, $baz) precondition: $foo != $bar effect: on += {4}; end action
action staticExpr($foo, $bar) precondition: ($foo < $bar and true) effect: on += {23}; end action
action nested($foo, $bar) precondition: ($foo < $bar and ($foo != $bar and $foo < $bar)) effect: on -= {2,3}; end action
action atom_three($dummy) precondition: $dummy in off effect: on += {4}; end action
action test_signal($dummy) precondition: true signal: $dummy end action

test_signal("Hello World!")