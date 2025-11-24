Answers
Task 1 – Storage
1. What happens if the designers of the Storage class decide to change the implementation of the List to LinkedList?

If Storage changes from ArrayList to LinkedList, any code that relies on ArrayList-specific methods will break. The list would still work as a List, but features unique to ArrayList (like trimToSize()) would no longer exist.

2. Does trimToSize() exist in LinkedList?

No.
trimToSize() is an ArrayList-specific method and does not exist in LinkedList.

3. Should Main know about what concrete type of List Storage provides?

No.
Main should only depend on the List interface, not on a specific implementation. This avoids unnecessary coupling and allows Storage to change implementation without breaking Main.

Task 2 – Employee & Roles
2. Is it possible in this design for an Engineer to also become a Manager?

No.
Engineer and Manager are different subclasses of Employee. An object cannot change its class after creation, so an Engineer cannot “become” a Manager in this inheritance model.

4. If you want a removeRole(Role) method, how do you have to change the Role class?

The Role class must implement equals() and hashCode() so that two role objects with the same name are treated as equal.
Without this, removing a role from a list won’t work reliably because the list won’t know how to identify matching Role objects.