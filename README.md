# thoughtful.ai
Software Engineer Technical screen coding challenge


I have written a simple PackageSorter Java program that helps determine how packages should be dispatched based on their given dimensions (which are width, height, and length) and mass. 

The program classifies packages into three categories:
1. STANDARD: Packages that are neither bulky nor heavy.
2. SPECIAL: Packages that are either bulky or heavy.
3. REJECTED: Packages that are both bulky and heavy.(if the volume is greater than or equal to 1,000,000 cm³ or if any dimension is greater than or equal to 150 cm and if it is heavy if its mass is greater than or equal to 20 kg.

Prerequisites
Java Development Kit (JDK): Make sure you have Java installed on your system.

Clone or Download the Program:
You can clone the repository or download the PackageSorter.java file.

Navigate to the Directory:
Open your terminal or command prompt and navigate to the directory where PackageSorter.java is saved.
cd path/to/directory

Compile the Program:
Compile the Java file using the javac command:
javac PackageSorter.java

Run the Program:
Run the compiled Java program using the java command:
java PackageSorter

Any inputs can be taken to test the program functionality.
I have tested the program with the following test cases.
100, 50, 20, 10        
200, 150, 50, 10
100, 50, 20, 25
200, 200, 100, 30

Output for my inputs:
STANDARD
SPECIAL
SPECIAL
REJECTED

How It Works
If the package's volume is greater than or equal to 1,000,000 cm³ or if any dimension (width, height, or length) is greater than or equal to 150 cm, it is considered bulky.
If the package's mass is greater than or equal to 20 kg, it is considered heavy.
If both conditions (bulky and heavy) are true, the package is REJECTED.
If only one of the conditions is true, the package is classified as SPECIAL.
If neither condition is true, the package is classified as STANDARD.
