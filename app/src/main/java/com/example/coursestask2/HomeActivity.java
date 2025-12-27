package com.example.coursestask2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnAndroid = findViewById(R.id.btnCourse1);
        Button btnIos = findViewById(R.id.btnCourse2);
        Button btnFullStack = findViewById(R.id.btnCourse3);

        btnAndroid.setOnClickListener(v ->
                openCourse(R.drawable.android, ANDROID_CONTENT));

        btnIos.setOnClickListener(v ->
                openCourse(R.drawable.ios, IOS_CONTENT));

        btnFullStack.setOnClickListener(v ->
                openCourse(R.drawable.fullstack, FULLSTACK_CONTENT));
    }

    private void openCourse(int image, String content) {
        Intent intent = new Intent(this, CourseDetailsActivity.class);
        intent.putExtra("image", image);
        intent.putExtra("content", content);
        startActivity(intent);
    }

    // ===== CONTENT =====

    private static final String ANDROID_CONTENT =
            "Part 1 (Java SE)\n\n" +

                    "1. Introduction to Java Programming\n" +
                    "• Overview\n" +
                    "• Compiler and JVM\n" +
                    "• Project Structure\n" +
                    "• Hello World Application\n" +
                    "• Variables and Data Types\n" +
                    "• Operators\n" +
                    "• Conditional Statements (IF - Switch)\n" +
                    "• Loops (For - While - Do While)\n\n" +

                    "2. Basics\n" +
                    "• Nested Loops\n" +
                    "• Strings\n" +
                    "• Arrays\n" +
                    "• Functions\n\n" +

                    "3. Object Oriented Programming\n" +
                    "• Classes and Objects\n" +
                    "• Encapsulation and Data Hiding\n" +
                    "• Inheritance\n" +
                    "• Polymorphism\n" +
                    "• Abstraction (Abstract Classes - Interfaces)\n\n" +

                    "4. Collections and Generics\n" +
                    "• Sets and Lists\n" +
                    "• Threading\n" +
                    "• Generics Classes and Methods\n\n" +

                    "Part 2 (Android Development)\n\n" +

                    "1. Introduction to Android\n" +
                    "• Android OS\n" +
                    "• Android Versions\n" +
                    "• OS Architecture\n" +
                    "• Application Components\n" +
                    "• Android Studio and Gradle\n" +
                    "• Creating Hello World Application\n\n" +

                    "2. UI Components\n" +
                    "• Layouts (ConstraintLayout - LinearLayout)\n" +
                    "• Using Resources (Drawables, Strings, Colors, Styles)\n\n" +

                    "3. UI Components II\n" +
                    "• Menu\n" +
                    "• Localization Support\n" +
                    "• Orientation Support\n\n" +

                    "4. Intents and Activities\n" +
                    "• Intents\n" +
                    "• Intent Filters\n\n" +

                    "5. Fragments\n" +
                    "• What is Fragment\n" +
                    "• Fragment Manager and Transactions\n" +
                    "• TabLayout, NavigationDrawer, BottomNavigation\n\n" +

                    "6. Dialogs\n" +
                    "• Alert Dialog\n" +
                    "• Dialog with Items\n" +
                    "• Custom Dialogs (DialogFragment)\n\n" +

                    "7. Data Storage\n" +
                    "• Shared Preferences\n" +
                    "• Room Database (Android Architecture Components)\n\n" +

                    "8. Threading and Services\n" +
                    "• Threading\n" +
                    "• Service and Intent Service\n\n" +

                    "9. Web Services and APIs\n" +
                    "• What is JSON\n" +
                    "• Network Calls and APIs\n" +
                    "• Consuming Web APIs\n" +
                    "• Retrofit and Gson Libraries\n" +
                    "• API Caching\n" +
                    "• Using Room with Retrofit\n" +
                    "• Repository Pattern\n\n" +

                    "10. Firebase Realtime Database\n" +
                    "• Working with Realtime Database\n\n" +

                    "11. Notifications\n" +
                    "• Simple Notifications\n" +
                    "• Firebase Push Notifications\n" +
                    "• OneSignal Push Notification SDK";


    private static final String FULLSTACK_CONTENT =
            "HTML\n" +
                    "HTML5\n" +
                    "CSS\n" +
                    "CSS3\n" +
                    "SASS\n" +
                    "Bootstrap 4\n" +
                    "JavaScript\n" +
                    "Regular Expressions\n" +
                    "ECMAScript 6 (ES6)\n" +
                    "JQuery\n" +
                    "Angular 7\n" +
                    "Fabric.js\n" +
                    "AJAX\n" +
                    "JSON\n" +
                    "Hosting and Domains\n" +
                    "Freelancing Tips and Tricks\n\n" +

                    "PHP\n" +
                    "MySQL\n" +
                    "Advanced MySQL Queries and Triggers\n\n" +

                    "Object Oriented Programming (OOP)\n" +
                    "Design Patterns\n" +
                    "MVC Architecture\n" +
                    "Laravel Framework\n\n" +

                    "Building APIs\n" +
                    "API Authentication\n" +
                    "Connecting WordPress with Laravel\n" +
                    "Building WordPress Web Services\n\n" +

                    "Agile Methodology\n" +
                    "Scrum Framework\n" +
                    "Software Development Process";


    private static final String IOS_CONTENT =
            "OOP Refreshment\n\n" +

                    "Introduction\n" +
                    "• Installing OS X Virtual Machine\n" +
                    "• Installing Xcode and iOS SDK\n" +
                    "• Xcode Tour\n" +
                    "• Xcode Playgrounds\n\n" +

                    "Swift Programming Language\n" +
                    "• Data Types, Constants, Variables\n" +
                    "• Operators and Expressions\n" +
                    "• Flow Control\n" +
                    "• Switch Statement\n" +
                    "• Functions\n" +
                    "• OOP in Swift\n" +
                    "• Subclassing and Extensions\n" +
                    "• Arrays and Dictionaries\n" +
                    "• Error Handling\n\n" +

                    "Views, Layouts and Storyboards\n" +
                    "• Xcode Project Types\n" +
                    "• Creating First Application\n" +
                    "• App File Structure\n" +
                    "• Storyboards\n" +
                    "• UI Components\n" +
                    "• UI Programmatically\n" +
                    "• Customizing UI\n" +
                    "• AutoLayout\n" +
                    "• Constraints in Interface Builder\n" +
                    "• Navigation Controller\n" +
                    "• Tab Bar Application\n" +
                    "• Custom Fonts\n" +
                    "• Table View\n" +
                    "• Gestures\n" +
                    "• Custom Table Cells\n" +
                    "• Animations\n" +
                    "• Subclass Examples\n\n" +

                    "Local Data\n" +
                    "• UserDefaults\n" +
                    "• CoreData\n" +
                    "• Realm Database\n" +
                    "• Data Models\n" +
                    "• Save and Retrieve Data\n\n" +

                    "ToDo App Project\n" +
                    "• UI Implementation\n" +
                    "• Realm Models\n" +
                    "• Restore ToDo Lists\n\n" +

                    "CocoaPods\n" +
                    "• Introduction to CocoaPods\n" +
                    "• Installing Pods\n" +
                    "• Using Pods in Projects\n" +
                    "• Finding Useful Pods\n" +
                    "• Realm Pod Example\n\n" +

                    "Networking\n" +
                    "• Alamofire\n" +
                    "• GET Requests\n" +
                    "• JSON Parsing (ObjectMapper)\n" +
                    "• POST Login Example\n" +
                    "• TableView with API Data\n\n" +

                    "Dynamic Animator\n" +
                    "• Physics Engine\n" +
                    "• Gravity Field\n" +
                    "• Collision Field\n" +
                    "• Other Physics Fields\n\n" +

                    "Maps\n" +
                    "• Maps Introduction\n" +
                    "• Current Location\n" +
                    "• Adding Pins\n\n" +

                    "Design Patterns\n" +
                    "• Singleton\n" +
                    "• MVC\n" +
                    "• Decorator\n" +
                    "• Adapter\n" +
                    "• Facade\n" +
                    "• Observer";
}
