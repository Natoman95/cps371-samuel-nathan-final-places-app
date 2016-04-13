### P6 
### Proposal
**Nathan Gray**
**Samuel Colacchia**
___

### Target Users:

People looking for restaurants, hotels, and attractions in their area who want a simple way to organize this data and sift through it quickly.

### Problems:

1. It can be annoying to navigate a web search looking for relevant nearby places when you want to find something quickly and efficiently.

2. Having to switch to a weather app to decide whether or not it’s even worth it to visit an attraction is an issue.

3. There are lots of subcategories underneath the heading of “attractions” that people might not know about when they’re doing a Google search that would help them to narrow down their search.

### Goals:

1. To provide a simple and elegant interface to find nearby restaurants, hotels, attractions, while providing an intelligent feed based on the time of day.

2. Reduce the amount of thought required to find a nearby attraction.

### Features:

1. Display categories and subcategories of place types in order to assist users in narrowing down their options.

2. Show summary data about each place.

3. Continuously information based on the user’s location.

4. Allow the user to change the search radius the application uses to find nearby places.

5. Display an overview of the weather so that users can quickly decide if it’s worth it to visit an outdoor attraction.

6. Integrate Google Maps functionality so that users can see visually where a place is located and even begin GPS navigation to it.

### API’s:

- Location Services
- Google Places
- Toast

### Use Cases:

1. *First time* - This use case occurs when the user first starts the app. Displays the simple message explaining the features of the app for the user knows what to do. Once the user is done with the message they are able to tap a button and it will not be displayed again.

2. *Feed Glance* - This use case occurs when the user starts the app and glances at the feed without tapping on any other icons. 

3. *Card Click* - This use case occurs when the user starts the app, finds a card and then clicks on the card. This brings them to a new window with more information about the chosen card and a link to open the current card in google maps.

4. *Change Categories* - This use case occurs when the user starts the app and changes the category by clicking on the button or tab at the bottom of the page. This brings them to a feed that only shows cards based on the category they tapped on. 

5. *Change Settings* - This use case occurs when the user starts the app and clicks on the settings button. This open the setting menu allowing the user to change the distance from them that we search.

### Diagrams:

First Time

![First Time](https://github.com/gordon-cs/cps371-samuel-nathan-final-places-app/blob/master/First%20Time.png)

Feed Glance

![Feed Glance](https://github.com/gordon-cs/cps371-samuel-nathan-final-places-app/blob/master/Feed%20Glance.png)

Card Click

![Card Click](https://github.com/gordon-cs/cps371-samuel-nathan-final-places-app/blob/master/Card%20Click.png)

Change Categories

![Change Categories](https://github.com/gordon-cs/cps371-samuel-nathan-final-places-app/blob/master/Change%20Category.png)

Change Settings

![Change Settings](https://github.com/gordon-cs/cps371-samuel-nathan-final-places-app/blob/master/Change%20Settings.png)
