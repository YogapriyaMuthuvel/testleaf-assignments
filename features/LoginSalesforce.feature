Feature: Login functionality of salesfore application

Scenario:
Given Launch the browser
And Load the URL
And Enter the username as 'yogapriya070599773@agentforce.com'
And Enter the password as 'Yogapriya@23'
When Click on the login button
Then It should be logged in
When Click on toggle menu button from the left corner
And Click view All
And Click Sales from App Launcher
And  Click on Accounts tab
And Click on New button
Given Enter 'Yoga' as account name
And Select Ownership as Public
When Click save and verify Account name
Then Account name to be verified


