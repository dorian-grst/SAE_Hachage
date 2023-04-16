### 📚ALEXIS CAMPS - DORIAN GRASSET - RUBEN GAY - ISSIAKA CISSOKHO📚


**SAE HACHAGE** 🏷️

In this repository, you will find our work on Hashing SAE [1st year].

---
### Table of contents 📁
1. [Code compilation & test launch](#code-compilation--test-launch-)
2. [Answers to questions](#answers-to-questions-)
3. [Files](#files-)

---
## Code compilation & test launch 📂

>**Step 1:**

Download the .java files in this repository, as well as the "script.sh" script and place them all in the same folder.

>**Step 2:**

Give execute permission to the script in the terminal using the command :
`chmod a+x script.sh`

>**Step 3:**

Navigate to the folder and run the script in the terminal using the command :
`./script.sh`

**Your .java files are compiled and the tests are displayed**

---
## Answers to questions 📂

>**Question 1:**

Knowing that |S| is the number of different words in the text and U is the set of all strings of at most 30 characters and there are 256 possible characters :

`|U| = 256^30`

When we have at most 32 characters :

`|U| = 32^30`

>**Question 2:**

Assuming that U = [0,x], one of the very simple data structures respecting :
- property p2 = we want the basic operations (insertion, deletion, search) to be very fast, in the sense that they execute very few operations (for example a constant number, that is bounded by a certain constant, or logarithmic in |T|).

Is the boolean array, which when the value is present in the array will return true, false otherwise.

>**Question 3:**

We know that a byte can represent 2⁸ values, which is 256 different values. If we have X possibilities of different character strings, to know how many bytes are needed, we calculate: X / (number of different values for 1 byte). We get `256^32 / 256 which is equal to the number of bytes needed to store an element of u.

>**Question 18:**

We have to find a number of multiplications to convert a string s(k). To do this, we will calculate each term (xi256^i) independently. For a word of size k, we calculate: `k*(k+1)/2 and we get a large number of multiplications.

>**Question 27:**

In the file "LeRougeEtLeNoir.txt" there are `14445 different words`.


---
## Files 📂

- [x] Dictionnaires.java 
- [x] HTNaive.java
- [x] HTNaiveMain.java
- [x] LeRougeEtLeNoir.txt
- [x] ListeBigI.java
- [x] Maillon.java
- [x] randomWords.txt
- [x] randomWordsPetit.txt
- [x] readme.md
- [x] script.sh

---

Département informatique - IUT Montpellier Sète – S6
