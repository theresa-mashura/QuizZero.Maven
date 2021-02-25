# QuizZero

Many of your quizzes and assessments coming up are like this quiz.
There are a bunch of tests in the `QuizZeroTest.java` file. 
Each test has a few `assertEqual()` lines in it.

``` java
    @Test
    public void qzero() {
        assertEquals(0, QuizZero.Qzero(5, 6));
        assertEquals(0, QuizZero.Qzero(3, -96));
    }
```

What you need to do is change the source code in `QuizZero.java` so that each of the 
fifteen methods pass all their respective tests.

So in the `Qzero()` method you will have to change

``` java
    public static  int Qzero(int a, int b) {
        return -1;
    }
```

to

``` java
    public static  int Qzero(int a, int b) {
        return 0;
    }
```

to pass all the tests in the `QuizZeroTest qzero` method.

So the basic drill is to look at the tests, and try to figure out how to write a very short little
java method that will return the results from the given input.

Code it up and run the tests. When they all pass, move on to next
problem.

Watch the demo carefully.

If the problem seems really hard to imagine, move on to the
next one.
The goal here is to get as many tests to pass as possible, not
to do them all in a sequence.

A passing score will be atleast 7 of the 16 tests.
