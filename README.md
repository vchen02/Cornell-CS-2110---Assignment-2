Cornell-CS-2110---Assignment-2
==============================

Learning objectives
>  Gain familiarity with String methods, if-statements, assignment, functions, and begin learning about Java loops.

Method Declarations

    **public static boolean containsOne(String s, String s2) { ... }**
     > Strings s and s1 are not null. Return true iff s contains exactly one occurrence
     >   of s2.
     >  
     >   Examples: For s = "ab" and s2 = "bb", return false
     >             For s = "abbb" and s2 = "bb", return true.
     >             For s = "abbbb" and s2 = "bb", return false. 
     

    **public static String fixName(String s) { ... }**
     >  String s consists of a first name followed by a last name. The two names are
     >  separated by 1 or more blanks. There may be blank characters at the
     >  beginning of s and at the end of s. 
     >  
     >  Examples: For s = "    David Gries"  return "Gries, David"
     >            For s = "Doug       James " return "James, Doug" 

     

     **public static String getInitials(String s) { ... }**
     >  String s contains a person's first name, last name, and possibly a middle name
     >  between them. There may be any number of blanks at the beginning and end
     >  of s, but between each pair of names there is exactly one blank.
     >  
     >  Return a String containing the person's initials.
     >  
     >  Examples: For s = "    David Joseph Gries" return "DJG".
     >            For s = "Doug James", return "DJ"; 
     

    **public static String replaceVowels(String s) { ... }**
     >  Return a string that is s but with all lowercase vowels (a, e, i, o, u)
     >  replaced by asterisks > .  
     >  
     >  Examples: For s = "Minecraft" return "M> n> cr> ft".
     >            For s = "Alan Turing" return "Al> n T> r> ng".
     

    **public static String replaceAllVowels(String s) { ... }**
     >  Return a string that is s but with all lowercase and uppercase
     >  vowels (a, e, i, o, u, A, E, I, O, U) replaced by asterisks > .  
     >  
     >  Examples: For s = "Minecraft" return "M> n> cr> ft".
     >            For s = "Alan Turing" return "> l> n T> r> ng".
     


    **public static String decompress(String s) { ... }**
     >  String s is written in a form that looks something like this: "b3c1b5x2a0".
     >  For this s, we want to return the decompressed string "bbbcbbbbbxx".
     >  More formally, s is in "compressed form", which means that it consists
     >  of a sequence of characters that are NOT digits 0..9 with each character
     >  followed by a digit; the digit indicates how many times that character
     >  should appear. Return the uncompressed version of s.
     
  
Self Learning Java Assignment - Fall 2014 CS 2110 Assignment 2
