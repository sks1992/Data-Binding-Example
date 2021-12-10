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

 * */