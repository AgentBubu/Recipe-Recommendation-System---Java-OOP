import java.util.*;

public class Main {
    public static void main(String[] args) {
        RecipeBook recipeBook = new RecipeBook();
        Set<Ingredient> allIngredients = new HashSet<>();
        List<User> allUsers = new ArrayList<>();

        // Pre-added Data
        // Users
        User user1 = new User(false, false, false, null, "Bubu", "123");
        User user2 = new User(false, false, false, null, "Dudu", "321");
        allUsers.add(user1);
        allUsers.add(user2);

        // Spices
        Spice turmeric = new Spice("Turmeric", "Spice", true, true, true, 2, "Earthy");
        Spice chiliPowder = new Spice("Chili Powder", "Spice", true, true, true, 7, "Pungent");
        Spice garlicPowder = new Spice("Garlic Powder", "Spice", true, true, true, 1, "Aromatic");
        Spice blackPepper = new Spice("Black Pepper", "Spice", true, true, true, 3, "Strong");
        Spice salt = new Spice("Salt", "Spice", true, true, true, 0, "Salty");
        Spice sugar = new Spice("Sugar", "Spice", true, true, true, 0, "Sweet");
        Spice cinnamon = new Spice("Cinnamon", "Spice", true, true, true, 1, "Sweet and woody");

        // Protein
        Protein chickenBreast = new Protein("Chicken Breast", "Protein", false, true, true, "Animal-based", 30, false);
        Protein tofu = new Protein("Tofu", "Protein", true, true, true, "Plant-based", 10, true);
        Protein egg = new Protein("Egg", "Protein", false, true, true, "Animal-based", 6, false);

        // Vegetables
        Vegetable spinach = new Vegetable("Spinach", "Vegetable", true, true, true, true);
        Vegetable carrot = new Vegetable("Carrot", "Vegetable", true, true, true, true);
        Vegetable tomato = new Vegetable("Tomato", "Vegetable", true, true, true, true);
        Vegetable pumpkin = new Vegetable("Pumpkin", "Vegetable", true, true, true, true);

        allIngredients.add(turmeric);
        allIngredients.add(chiliPowder);
        allIngredients.add(garlicPowder);
        allIngredients.add(blackPepper);
        allIngredients.add(salt);
        allIngredients.add(sugar);
        allIngredients.add(cinnamon);
        allIngredients.add(chickenBreast);
        allIngredients.add(tofu);
        allIngredients.add(egg);
        allIngredients.add(spinach);
        allIngredients.add(carrot);
        allIngredients.add(tomato);
        allIngredients.add(pumpkin);

        // 1. Spicy Stir Fry Tofu
        List<Ingredient> stirFryIngredients = new ArrayList<>();
        stirFryIngredients.add(tofu);
        stirFryIngredients.add(chiliPowder);
        stirFryIngredients.add(spinach);
        stirFryIngredients.add(carrot);

        List<String> stirFrySteps = new ArrayList<>();
        stirFrySteps.add("Heat oil in pan.");
        stirFrySteps.add("Add tofu and stir fry until golden brown");
        stirFrySteps.add("Add chili powder and mix well.");
        stirFrySteps.add("Add chopped spinach and carrot, and stir-fry for 5 minutes.");
        stirFrySteps.add("Serve hot.");

        MainCouseRecipe spicyStirFryTofu = new MainCouseRecipe("Spicy Stir Fry Tofu", stirFryIngredients, "Asian",
                stirFrySteps, 1);

        // 2. Golden Chicken Curry
        List<Ingredient> curryIngredients = new ArrayList<>();
        curryIngredients.add(chickenBreast);
        curryIngredients.add(turmeric);
        curryIngredients.add(chiliPowder);
        curryIngredients.add(carrot);

        List<String> currySteps = new ArrayList<>();
        currySteps.add("Marinate chicken with turmeric and chili powder.");
        currySteps.add("Heat oil in a pot and sauté the marinated chicken.");
        currySteps.add("Add carrots and cook until tender.");
        currySteps.add("Simmer with water or coconut milk for 15 minutes.");
        currySteps.add("Serve with rice.");

        MainCouseRecipe goldenChickenCurry = new MainCouseRecipe("Golden Chicken Curry", curryIngredients, "Indian",
                currySteps, 4);

        // 3. Pumpkin Cinnamon Pie
        List<Ingredient> pieIngredients = new ArrayList<>();
        pieIngredients.add(pumpkin);
        pieIngredients.add(cinnamon);
        pieIngredients.add(egg);

        List<String> pieSteps = new ArrayList<>();
        pieSteps.add("Preheat oven to 180°C.");
        pieSteps.add("Peel and slice the pumpkin.");
        pieSteps.add("Blend the pumpkin with cinnamon.");
        pieSteps.add("Prepare the pie crust and fill it with the pumpkin mixture.");
        pieSteps.add("Brush the crust with egg wash for a golden finish.");
        pieSteps.add("Bake for 45 minutes until the crust is golden brown.");
        pieSteps.add("Let cool before serving.");

        DessertRecipe pumpkinCinnamonPie = new DessertRecipe("Pumpkin Cinnamon Pie", pieIngredients, "American",
                pieSteps, 7);

        // Add to RecipeBook
        recipeBook.addRecipe(spicyStirFryTofu);
        recipeBook.addRecipe(goldenChickenCurry);
        recipeBook.addRecipe(pumpkinCinnamonPie);

        // Main
        Scanner scan = new Scanner(System.in);
        boolean benar = true;
        User currentUser = null;

        while (currentUser == null) {
            currentUser = login(allUsers);
        }

        while (benar) {
            try {
                int menu = menu();
                switch (menu) {
                    case 1:
                        enterIngredients(recipeBook);
                        break;
                    case 2:
                        displayAllRecipes(recipeBook);
                        break;
                    case 3:
                        addNewRecipe(recipeBook, allIngredients);
                        break;
                    case 4:
                        rateRecipe(recipeBook, currentUser);
                        break;
                    case 5:
                        recommendRecipes(recipeBook, currentUser);
                        break;
                    case 6:
                        popularRecipes(recipeBook, allUsers);
                        break;
                    case 7:
                        searchRecipes(recipeBook);
                        break;
                    case 8:
                        System.out.println("Exiting...");
                        benar = false;
                        break;
                    default:
                        System.out.println("Invalid input! Try again...");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Try again...");
            }
        }
    }

    static User login(List<User> allUsers) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=============== LOGIN ===============");
        System.out.print("Enter name: ");
        String name = scan.nextLine().toLowerCase();
        System.out.print("Enter password: ");
        String password = scan.nextLine();

        for (User user : allUsers) {
            if (user.getName().toLowerCase().equals(name) && user.getPassword().equals(password)) {
                System.out.println("Login successful! Welcome, " + user.getName() + "!");
                System.out.println();
                return user;
            }
        }

        System.out.println("Invalid name or password. Please try again.");
        System.out.println();
        return null;
    }

    static int menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                Welcome To The Recipe Recommendation System

                =============== MENU ===============
                1. Enter available ingredients
                2. View all recipes
                3. Add a new recipe
                4. Rate recipe
                5. View recommended recipes
                6. View popular recipes
                7. Search for recipes
                8. Exit
                """);
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();
        return choice;
    }

    static void enterIngredients(RecipeBook recipeBook) {
        Scanner scan = new Scanner(System.in);
        List<String> inputIngredients = new ArrayList<>();
        List<Recipe> listOfRecipes = recipeBook.getAllRecipes();
        List<Recipe> results = new ArrayList<>();

        try {
            System.out.print("Enter number of ingredients: ");
            int num = scan.nextInt();
            scan.nextLine();

            for (int i = 1; i <= num; i++) {
                System.out.print("Enter name of ingredient-" + i + ": ");
                String name = scan.nextLine().toLowerCase();
                inputIngredients.add(name);
            }

            if (listOfRecipes == null || listOfRecipes.isEmpty()) {
                System.out.println("No recipes available in the Recipe Book.");
                return;
            }

            System.out.println("\nBased on your ingredients: " + inputIngredients);
            System.out.println("Recommended recipes:");

            boolean foundRecipe = false;
            int i = 1;
            for (Recipe recipe : listOfRecipes) {
                List<String> missingIngredients = new ArrayList<>();
                for (Ingredient ingredient : recipe.getIngredients()) {
                    if (!inputIngredients.contains(ingredient.getName().toLowerCase())) {
                        missingIngredients.add(ingredient.getName());
                    }
                }

                if (missingIngredients.size() < recipe.getIngredients().size()) {
                    System.out.println(i + ". Recipe: " + recipe.getName());
                    System.out.println(
                            "   Missing Ingredients: " + (missingIngredients.isEmpty() ? "None" : missingIngredients));
                    foundRecipe = true;
                    results.add(recipe);
                    System.out.println();
                    i++;
                }
            }

            System.out.println("View recipe details?");
            System.out.print("Enter choice (y/n): ");
            String choice = scan.next().toLowerCase();
            System.out.println();
            if (choice.equals("y") || choice.equals("yes")) {
                try {
                    System.out.print("Enter recipe sequence number: ");
                    int sequence = scan.nextInt() - 1;
                    System.out.println(results.get(sequence).toString());
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a valid number...");
                }
            } else {
                System.out.println();
                return;
            }

            if (!foundRecipe) {
                System.out.println("No available recipes based on your ingredients.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number...");
            scan.nextLine();
        }
    }

    static void displayAllRecipes(RecipeBook recipeBook) {
        List<Recipe> allRecipes = recipeBook.getAllRecipes();
        System.out.println("=== ALL RECIPES ===");
        int i = 1;
        for (Recipe recipe : allRecipes) {
            System.out.println(i);
            System.out.println(recipe.toString());
            i++;
        }
        System.out.println();
    }

    static void addNewRecipe(RecipeBook recipeBook, Set<Ingredient> allIngredients) {
        Scanner scan = new Scanner(System.in);
        List<Ingredient> requiredIngredients = new ArrayList<>();
        List<String> preparationSteps = new ArrayList<>();

        System.out.println("=== ADD RECIPE ===");
        System.out.print("Enter recipe type (Maincourse / Dessert): ");
        String recipeType = scan.nextLine().toLowerCase();

        System.out.print("Enter recipe name: ");
        String name = scan.nextLine();

        System.out.print("Enter cuisine type: ");
        String cuisineType = scan.nextLine();

        System.out.println("Ingredients List");
        System.out.print("Enter number of ingredients: ");
        int num = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.print("Enter name of ingredient-" + (i + 1) + ": ");
            String ingredientName = scan.nextLine().toLowerCase();

            Ingredient existingIngredient = allIngredients.stream()
                    .filter(ing -> ing.getName().equalsIgnoreCase(ingredientName))
                    .findFirst()
                    .orElse(null);

            if (existingIngredient != null) {
                requiredIngredients.add(existingIngredient);
            } else {
                System.out.println("Ingredient not found. Adding a new ingredient.");
                System.out.print("Enter ingredient category: ");
                String category = scan.nextLine();

                System.out.print("Is this ingredient vegetarian? (true/false): ");
                boolean isVegetarian = scan.nextBoolean();

                System.out.print("Is this ingredient gluten-free? (true/false): ");
                boolean isGlutenFree = scan.nextBoolean();

                System.out.print("Is this ingredient dairy-free? (true/false): ");
                boolean isDairyFree = scan.nextBoolean();
                scan.nextLine();

                Ingredient newIngredient = new Ingredient(ingredientName, category, isVegetarian, isGlutenFree,
                        isDairyFree);
                allIngredients.add(newIngredient);
                requiredIngredients.add(newIngredient);
            }
        }

        System.out.println("Preparation Steps");
        System.out.print("Enter number of steps: ");
        int stepsCount = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < stepsCount; i++) {
            System.out.print("Step " + (i + 1) + ": ");
            String stepDetail = scan.nextLine();
            preparationSteps.add(stepDetail);
        }

        if (recipeType.equals("maincourse")) {
            System.out.print("Enter serving size: ");
            int servings = scan.nextInt();
            scan.nextLine();
            MainCouseRecipe newRecipe = new MainCouseRecipe(name, requiredIngredients, cuisineType, preparationSteps,
                    servings);
            recipeBook.addRecipe(newRecipe);
            System.out.println("Main course recipe added successfully!");
        } else if (recipeType.equals("dessert")) {
            System.out.print("Enter sweetness level (1-10): ");
            int sweetnessLevel = scan.nextInt();
            scan.nextLine();
            DessertRecipe newRecipe = new DessertRecipe(name, requiredIngredients, cuisineType, preparationSteps,
                    sweetnessLevel);
            recipeBook.addRecipe(newRecipe);
            System.out.println("Dessert recipe added successfully!");
        } else {
            System.out.println("Invalid recipe type. Recipe not added.");
        }
    }

    static void rateRecipe(RecipeBook recipeBook, User user) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n=== RATE RECIPE ===");
        System.out.println("""
                Stars Criteria:
                - 1: Dislike
                - 2: Not bad
                - 3: Just right
                - 4: Excellent
                - 5: Favorite
                """);

        int i = 1;
        List<Recipe> recipes = recipeBook.getAllRecipes();
        for (Recipe recipe : recipes) {
            System.out.println(i + ". " + recipe.getName());
            i++;
        }

        while (true) {
            System.out.print("Enter recipe sequence number: ");
            int num = scan.nextInt() - 1;
            scan.nextLine();

            if (num < 0 || num >= recipes.size()) {
                System.out.println("Invalid recipe number. Try again.");
                continue;
            }

            Recipe recipe = recipes.get(num);
            System.out.print("Enter number of stars (1-5): ");
            int stars = scan.nextInt();
            scan.nextLine();

            if (stars < 1 || stars > 5) {
                System.out.println("Invalid star rating. Enter a number between 1 and 5.");
            } else {
                user.rateRecipe(recipe, stars);
                System.out.println("You rated " + recipe.getName() + " with " + stars + " stars.");
            }

            System.out.println("Rate another recipe?");
            System.out.print("Enter choice (y/n): ");
            String choice = scan.nextLine().toLowerCase();
            if (choice.equals("n") || choice.equals("no")) {
                System.out.println();
                break;
            }
            System.out.println();
        }
    }

    static void recommendRecipes(RecipeBook recipeBook, User user) {
        System.out.println("\n=== RECOMMENDED RECIPES ===");

        List<Recipe> recipes = recipeBook.getAllRecipes();
        if (recipes.isEmpty()) {
            System.out.println("No recipes available.");
            return;
        }

        boolean found = false;
        for (Recipe recipe : recipes) {
            boolean matchesDiet = true;

            for (Ingredient ingredient : recipe.getIngredients()) {
                if (user.isVegetarian() && !ingredient.isVegetarian()) {
                    matchesDiet = false;
                    break;
                }
                if (user.isGlutenFree() && !ingredient.isGlutenFree()) {
                    matchesDiet = false;
                    break;
                }
                if (user.isDairyFree() && !ingredient.isDairyFree()) {
                    matchesDiet = false;
                    break;
                }
            }

            Integer userRating = user.getRecipeRatings().get(recipe);

            if (matchesDiet || (userRating != null && userRating >= 4)) {
                found = true;
                System.out.println("Recipe: " + recipe.getName());
                System.out.println("Cuisine: " + recipe.getCuisineType());
                System.out.println("Your rating: " + (userRating != null ? userRating : "Not rated"));
                System.out.println();
            }
        }

        if (!found) {
            System.out.println("No recipes match your preferences or ratings.");
        }
    }

    static void popularRecipes(RecipeBook recipeBook, List<User> users) {
        System.out.println("\n=== POPULAR RECIPES ===");

        Map<Recipe, Integer> recipeRatingsSum = new HashMap<>();
        Map<Recipe, Integer> recipeRatingsCount = new HashMap<>();

        for (User user : users) {
            for (Map.Entry<Recipe, Integer> entry : user.getRecipeRatings().entrySet()) {
                Recipe recipe = entry.getKey();
                int rating = entry.getValue();

                recipeRatingsSum.put(recipe, recipeRatingsSum.getOrDefault(recipe, 0) + rating);
                recipeRatingsCount.put(recipe, recipeRatingsCount.getOrDefault(recipe, 0) + 1);
            }
        }

        List<Map.Entry<Recipe, Double>> sortedRecipes = recipeRatingsSum.entrySet().stream()
                .map(entry -> Map.entry(entry.getKey(),
                        (double) entry.getValue() / recipeRatingsCount.get(entry.getKey())))
                .sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()))
                .toList();

        if (sortedRecipes.isEmpty()) {
            System.out.println("No ratings available.");
        } else {
            for (Map.Entry<Recipe, Double> entry : sortedRecipes) {
                System.out.println("Recipe: " + entry.getKey().getName());
                System.out.println("Cuisine: " + entry.getKey().getCuisineType());
                System.out.printf("Average Rating: %.2f\n", entry.getValue());
                System.out.println();
            }
        }
    }

    static void searchRecipes(RecipeBook recipeBook) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n=== SEARCH RECIPES ===");
        System.out.print("Enter search criteria (name or cuisine type): ");
        String criteria = scan.nextLine();

        List<Recipe> filteredRecipes = recipeBook.filterByCriteria(criteria);

        if (filteredRecipes.isEmpty()) {
            System.out.println("No recipes found matching your search criteria.");
        } else {
            System.out.println("\n=== SEARCH RESULTS ===");
            int i = 1;
            for (Recipe recipe : filteredRecipes) {
                System.out.println(i + ". Recipe Name: " + recipe.getName());
                System.out.println("   Cuisine Type: " + recipe.getCuisineType());
                System.out.println();
                i++;
            }
        }
    }
}
