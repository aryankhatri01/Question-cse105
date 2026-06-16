# Smart Warehouse

## Objective
Demonstrate the use of:
- Abstract Classes
- Interfaces
- Inheritance
- Method Overriding

## Classes

### StorageUnit
Abstract class containing:
- id
- capacity

### Refrigerated
Interface containing:
- adjustTemp(int temperature)

### ColdBox
Extends StorageUnit and implements Refrigerated.

## Features
- Stores warehouse unit information
- Supports refrigerated storage
- Allows temperature adjustment

## Output
Displays storage details and current temperature.