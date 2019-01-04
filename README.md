## Write and execute local JVM unit tests
This code sample is just a naive example that shows two ways which local unit tests are used. 

### Testing standalone units
These don't interact with anything relating to Android. They just POJO's.

### Testing presenters with Mockito
I have found that writing local tests that test views are quite hard. One way to test it is to follow the MVP design principles where you just test a mocked out view and you trust Android to do Android things like setting background colours, hiding views and displaying information.

### Testing using Robolectric
Robolectric is impressive, it allows for unit tests that involve the Android framework, and you are not tied down to using MVP for view testing. Robolectric defangs the Android SDK by rewriting the Android classes as they are loaded. This code sample demonstrates a simple way in which Robolectric can be used.
