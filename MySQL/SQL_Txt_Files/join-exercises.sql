USE PersonalTrainer;

-- Select all columns from ExerciseCategory and Exercise.
-- The tables should be joined on ExerciseCategoryId.
-- This query returns all Exercises and their associated ExerciseCategory.
-- 64 rows
--------------------

select *
from ExerciseCategory
inner join Exercise
	on ExerciseCategory.ExerciseCategoryId = Exercise.ExerciseCategoryId;


-- Select ExerciseCategory.Name and Exercise.Name
-- where the ExerciseCategory does not have a ParentCategoryId (it is null).
-- Again, join the tables on their shared key (ExerciseCategoryId).
-- 9 rows
--------------------

select ec.Name, e.Name
from ExerciseCategory ec inner join Exercise e on
ec.ExerciseCategoryId = e.ExerciseCategoryId
where ec.ParentCategoryId is null;


-- The query above is a little confusing. At first glance, it's hard to tell
-- which Name belongs to ExerciseCategory and which belongs to Exercise.
-- Rewrite the query using an aliases. 
-- Alias ExerciseCategory.Name as 'CategoryName'.
-- Alias Exercise.Name as 'ExerciseName'.
-- 9 rows
--------------------

select ec.Name ExerciseCategory, e.Name Exercise
from ExerciseCategory ec inner join Exercise e on
ec.ExerciseCategoryId = e.ExerciseCategoryId
where ec.ParentCategoryId is null;

-- Select FirstName, LastName, and BirthDate from Client
-- and EmailAddress from Login 
-- where Client.BirthDate is in the 1990s.
-- Join the tables by their key relationship. 
-- What is the primary-foreign key relationship?
-- 35 rows
--------------------

select FirstName, LastName , BirthDate, EmailAddress
from client c inner join login l
	on c.ClientId = l.ClientId
where c.BirthDate like '199%';


-- Select Workout.Name, Client.FirstName, and Client.LastName
-- for Clients with LastNames starting with 'C'?
-- How are Clients and Workouts related?
-- 25 rows
--------------------

select w.Name, c.FirstName, c.LastName
from Client c inner join clientworkout cw on c.ClientId = cw.ClientId
inner join workout w on cw.workoutId = w.workoutId
where c.LastName like 'C%';

-- Select Names from Workouts and their Goals.
-- This is a many-to-many relationship with a bridge table.
-- Use aliases appropriately to avoid ambiguous columns in the result.
--------------------

select w.Name as WorkOutName, g.Name as GoalName
from workout w
inner join workoutgoal wg on w.workoutId = wg.workoutId
inner join goal g on wg.goalId = g.goalId;


-- Select FirstName and LastName from Client.
-- Select ClientId and EmailAddress from Login.
-- Join the tables, but make Login optional.
-- 500 rows
--------------------

select c.FirstName, c.Lastname, l.ClientId, l.EmailAddress
from `Client` c 
left outer join login l on c.ClientId = l.ClientId;

SELECT c.FirstName,    c.LastName,    l.ClientId,    l.EmailAddress FROM Client c LEFT OUTER JOIN Login l ON c.ClientId = l.ClientId;


SELECT
c.FirstName,
c.LastName,
l.ClientId,
l.EmailAddress
FROM Client c
LEFT OUTER JOIN Login l On c.ClientId = l.ClientId;

-- Using the query above as a foundation, select Clients
-- who do _not_ have a Login.
-- 200 rows
--------------------

select c.FirstName, c.Lastname, l.ClientId, l.EmailAddress
from Client c 
	left outer join login l on c.ClientId = l.ClientId
where l.EmailAddress is null;

-- Does the Client, Romeo Seaward, have a Login?
-- Decide using a single query.
-- nope :(
--------------------

select c.FirstName, c.Lastname, l.ClientId, l.EmailAddress
from Client c 
left outer join login l on c.ClientId = l.ClientId
where c.FirstName = 'Romeo' AND c.Lastname = 'Seaward';

-- Select ExerciseCategory.Name and its parent ExerciseCategory's Name.
-- This requires a self-join.
-- 12 rows
--------------------
    
-- Rewrite the query above so that every ExerciseCategory.Name is
-- included, even if it doesn't have a parent.
-- 16 rows
--------------------

-- Are there Clients who are not signed up for a Workout?
-- 50 rows
--------------------

-- Which Beginner-Level Workouts satisfy at least one of Shell Creane's Goals?
-- Goals are associated to Clients through ClientGoal.
-- Goals are associated to Workouts through WorkoutGoal.
-- 6 rows, 4 unique rows
--------------------

-- Select all Workouts. 
-- Join to the Goal, 'Core Strength', but make it optional.
-- You may have to look up the GoalId before writing the main query.
-- If you filter on Goal.Name in a WHERE clause, Workouts will be excluded.
-- Why?
-- 26 Workouts, 3 Goals
--------------------

-- The relationship between Workouts and Exercises is... complicated.
-- Workout links to WorkoutDay (one day in a Workout routine)
-- which links to WorkoutDayExerciseInstance 
-- (Exercises can be repeated in a day so a bridge table is required) 
-- which links to ExerciseInstance 
-- (Exercises can be done with different weights, repetions,
-- laps, etc...) 
-- which finally links to Exercise.
-- Select Workout.Name and Exercise.Name for related Workouts and Exercises.
--------------------
   
-- An ExerciseInstance is configured with ExerciseInstanceUnitValue.
-- It contains a Value and UnitId that links to Unit.
-- Example Unit/Value combos include 10 laps, 15 minutes, 200 pounds.
-- Select Exercise.Name, ExerciseInstanceUnitValue.Value, and Unit.Name
-- for the 'Plank' exercise. 
-- How many Planks are configured, which Units apply, and what 
-- are the configured Values?
-- 4 rows, 1 Unit, and 4 distinct Values
--------------------