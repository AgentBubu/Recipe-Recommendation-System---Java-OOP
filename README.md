# Recipe Recommendation System

A Java-based console application for managing, searching, and recommending recipes based on user preferences and available ingredients.

## Features

- **User Authentication:** Simple login system for users.
- **Recipe Management:** Add, view, and search recipes (Main Course and Dessert types).
- **Ingredient Management:** Add new ingredients or select from existing ones.
- **Dietary Preferences:** Filter and recommend recipes based on vegetarian, gluten-free, and dairy-free preferences.
- **Recipe Rating:** Users can rate recipes; popular recipes are ranked by average rating.
- **Ingredient-Based Recommendations:** Suggest recipes based on ingredients you have.
- **Cuisine Search:** Search recipes by name or cuisine type.

## How to Run

1. **Compile all Java files:**
   ```
   javac *.java
   ```
2. **Run the main program:**
   ```
   java Main
   ```

## Project Structure

- `Main.java` - Entry point and main menu logic.
- `RecipeBook.java` - Stores and manages recipes.
- `Recipe.java` - Base class for recipes.
- `MainCouseRecipe.java`, `DessertRecipe.java` - Specialized recipe types.
- `Ingredient.java` - Base class for ingredients.
- `Vegetable.java`, `Protein.java`, `Spice.java` - Ingredient subclasses.
- `User.java`, `UserPreference.java` - User and preference management.
- `Filterable.java` - Interface for filtering recipes.

## Usage

- **Login:** Enter your username and password.
- **Menu Options:**
  1. Enter available ingredients to get recipe suggestions.
  2. View all recipes.
  3. Add a new recipe (with custom or existing ingredients).
  4. Rate recipes.
  5. View recommended recipes based on your preferences and ratings.
  6. View popular recipes by average rating.
  7. Search for recipes by name or cuisine.
  8. Exit the application.

## Notes

- The system comes with some pre-added users, ingredients, and recipes.
- All data is stored in memory; exiting the program will reset all changes.

---
