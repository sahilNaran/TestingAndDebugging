## Testing and Debugging
This code sample demonstrates the bare minimum on how tests are written in Android

### Testing standalone units
These don't interact with anything relating to Android. They just POJO's.

### Testing presenters with Mockito
I have found that writing local tests that test views are quite hard. One way to test it is to follow the MVP design principles where you just test a mocked out view and you trust Android to do Android things like setting background colours, hiding views and displaying information.

### Testing using Robolectric
Robolectric is impressive, it allows for unit tests that involve the Android framework, and you are not tied down to using MVP for view testing. Robolectric defangs the Android SDK by rewriting the Android classes as they are loaded. This code sample demonstrates a simple way in which Robolectric can be used.

### UI tests with Espresso
UI tests run on the actual device or emulator and is quite rewarding to watch them pass. These tests simulate a person entering information and clicking through the app. The  only hiccup is that sometimes animations may get in the way - i'd suggest turning off animations in the developer settings. 
