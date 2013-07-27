fluent on;
on = {1, 2, 3};
fluent off;
off = on;
fluent baz;
baz = {"fubar", "barfu"};
$n = 1;
$m = 2;

action test_simple($foo, $bar) precondition: $foo <= $bar effect: on += {7}; end action
action test_argument_mismatch($foo, $bar, $baz) precondition: $foo != $bar effect: on -= {4}; end action
action test_complex_static($foo, $bar) precondition: ($foo < $bar and true) effect: on += {23}; end action
action test_nested($foo, $bar) precondition: ($foo < $bar and ($foo != $bar and $foo < $bar)) effect: on -= {2,3}; end action
action test_atom_three($dummy) precondition: $dummy in baz effect: on += {4}; end action
action test_signal($dummy) precondition: true signal: $dummy end action
action test_set_comp($dummy) precondition: on > baz end action

on
test_atom_three("barfuu")
on