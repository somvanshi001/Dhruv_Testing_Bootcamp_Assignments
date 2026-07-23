Feature: Covered E-Commerce Application

Scenario: Customer Registration
Given the user should launch the E-commerce application
And the user is on the Home page
And the user navigates to the Registration page
When the user enters valid registration details
Then  the user clicks the Register button
Then the account should be created successfully
Then a confirmation message should be displayed

Scenario: Customer Login
Given the user should launch the E-commerce application
And the user is on the Home page
And the user navigates to the Login page
When the user enters a valid Email and Password
Then  the user clicks the Login button
Then the user should be logged in successfully
Then the user should be redirected to the Home page


Scenario: Product Search
Given the user is on the Home page
When the user enters a valid product keyword in the search bar
Then the user clicks the Search icon/button
Then relevant product results should be displayed


Scenario: Product Details
Given the user has performed a product search
And the search results are displayed
When the user clicks on a product from the results
Then the product details page should open
Then it should display the product name, price, description, and images


Scenario: Add to Cart
Given the user is on the Product Details page
When the user selects the required quantity/size
And the user clicks the 'Add to Cart' button
Then the product should be added to the cart
Then the cart item count should be updated


Scenario: Update Cart
Given the user has a product in the cart
When the user navigates to the Cart page
Then the user updates the quantity of the product
And the user clicks the 'Update Cart' button
Then the cart should reflect the updated quantity
Then the total price should be recalculated


Scenario: Remove from Cart
Given the user has a product in the cart
When the user navigates to the Cart page
Then the user clicks the 'Remove' option for a product
Then the product should be removed from the cart
Then the cart total should be updated accordingly


Scenario: Wishlist
Given the user is on the Product Details page
When the user clicks the 'Add to Wishlist' icon/button
Then the product should be added to the wishlist
Then a confirmation message should be displayed


Scenario: Checkout
Given the user has one or more products in the cart
When the user navigates to the Cart page
Then the user clicks the 'Checkout' button
Then the user should be redirected to the Checkout page
Then the order summary along with delivery address fields should be displayed


Scenario: Payment
Given the user is on the Checkout page
And the user has entered a valid delivery address
When the user selects a payment method
Then the user enters valid payment details
Then the user clicks the 'Pay Now' button
Then the payment should be processed successfully


Scenario: Order Confirmation
Given the user has completed the payment successfully
When the payment is confirmed
Then the Order Confirmation page should be displayed
Then it should show the Order ID, order summary, and estimated delivery date


Scenario: Order History
Given the user is logged in
And the user has placed at least one order previously
When the user navigates to the 'Order History' page
Then all previous orders should be listed
Then each order should display Order ID, date, status, and amount


Scenario: Logout
Given the user is logged in
When the user clicks on the profile/account icon
Then the user clicks the 'Logout' button
Then the user should be logged out successfully
Then the user should be redirected to the Login/Home page


