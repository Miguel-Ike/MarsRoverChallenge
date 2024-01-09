# Mars Rovers Coding Challenge

## Introduction

This project simulates a squad of robotic rovers exploring a plateau on Mars. The focus is to demonstrate coding and software design skills.

## Problem Description

NASA has landed a squad of robotic rovers on a rectangular plateau on Mars. The goal is for these rovers to navigate the plateau to get a complete view of the surrounding terrain and send it back to Earth.

### Rover's Mechanics

- The position and location of a rover are represented by a combination of x and y coordinates and a letter representing one of the four cardinal compass points (N, E, S, W).
- The plateau is divided into a grid to simplify navigation.
- Example position: `0, 0, N` indicates the rover is in the bottom left corner facing North.

### Control Instructions

- NASA sends a string of letters to control a rover.
- Possible letters are 'L', 'R', and 'M':
  - 'L' and 'R' make the rover spin 90 degrees left or right, respectively, without moving from its spot.
  - 'M' means move forward one grid point, maintaining the same heading.
- Movement assumption: The square directly North from `(x, y)` is `(x, y+1)`.

## Input/Output Format

### Input

1. The first line contains the upper-right coordinates of the plateau, assuming the lower-left coordinates are 0,0.
2. Subsequent lines contain information for each rover:
   - First line: Rover's starting position (two integers and a letter, e.g., `1 2 N`).
   - Second line: Series of instructions for exploring the plateau (e.g., `LMLMLMLMM`).

### Output

The output is the final coordinates and heading for each rover.

## Test Example

Input for creating the plateau

```
5 5
```

Input - First Rover

```
1 2 N

LMLMLMLMM
```

Output - First Rover

```
1 3 N
```

Input - Second Rover

```
3 3 E

MMRMMRMRRM
```

Output - Second Rover

```
5 1 E
```

## Getting Started
### Prerequisites

Before running this project, you need to have the Java Development Kit (JDK) installed. This project was developed with JDK 17.0.2, but it should be compatible with other versions as well.

### Console Output Example

Here is a textual representation of the console output example for the Mars Rover application:

```plaintext
Please enter the dimensions of the Plateau (example: 5 5):
5 5

Enter the initial position of Rover 1 (example: 1 2 N):
1 2 N

Enter the movement commands for Rover 1 (example: LMLMLMLMM):
LMLMLMLMM

Final position of Rover 1: 1 3 N

Do you want to try with another Rover? (Yes/No):
N
```

## Executable JAR

The latest executable JAR file can be found on OneDrive:

[Download Mars Rover Challenge JAR](https://1drv.ms/f/s!AsuuB8Xutl_sgZ5-LlTSWAjgASvyHQ?e=tCv5Yq)

Click the link above, and you will be redirected to the OneDrive folder containing the `MarsRoverChallenge.jar` file. From there, you can download the file to your local machine.

### Running the JAR

To run the JAR file, you'll need to have Java installed on your system. Once you've downloaded the JAR file, open your command line interface and navigate to the download location. You can start the application using the following command:

```bash
java -jar MarsRoverChallenge.jar
```