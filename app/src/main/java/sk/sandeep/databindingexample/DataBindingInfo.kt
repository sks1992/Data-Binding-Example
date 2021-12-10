package sk.sandeep.databindingexample

/**
 * Data Binding ::=>
 * The Data Binding Library is an Android Jetpack library that allows you to bind UI components in
 * your XML layouts to data sources in your app using a declarative format rather than
 * programmatically, reducing boilerplate code.

                 OR

The Data Binding Library is a support library that allows you to bind UI components in your layouts
to data sources in your app using a declarative format rather than programmatically.

Layouts are often defined in activities with code that calls UI framework methods. For example, the
code below calls findViewById() to find a TextView widget and bind it to the userName property of
the viewModel variable:

    findViewById<TextView>(R.id.sample_text).apply {
    text = viewModel.userName
    }

The following example shows how to use the Data Binding Library to assign text to the widget
directly in the layout file. This removes the need to call any of the Java code shown above. Note
the use of @{} syntax in the assignment expression:

    <TextView
    android:text="@{viewmodel.userName}" />


To enabled Data Binding in build.gradle

android {
    ...
    buildFeatures {
    dataBinding true
    }
}


To convert a regular layout to Data Binding layout:

Wrap your layout with a <layout> tag
Add layout variables (optional)
Add layout expressions (optional)


Layout variables are used to write layout expressions. Layout expressions are placed in the value
of element attributes and they use the @{expression} format. Here are some examples:


// Some examples of complex layout expressions
android:text="@{String.valueOf(index + 1)}"
android:visibility="@{age < 13 ? View.GONE : View.VISIBLE}"
android:transitionName='@{"image_" + id}'

The layout expression language gives you a lot of power, but it is best to avoid nesting complex
logic inside views. Complex expressions will make your layout harder to read and maintain.

<data>
<variable
name="viewmodel"
type="com.example.android.databinding.basicsample.data.SimpleViewModel"/>
</data>


<TextView
android:id="@+id/plain_name"
android:text="@{viewmodel.name}"
... />
<TextView
android:id="@+id/plain_lastname"
android:text="@{viewmodel.lastName}"
... />

android:onClick="@{() -> viewmodel.onLike()}"


binding.viewmodel = viewModel
 * */