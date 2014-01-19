json-config-file
================
Java JSON-Config-File is a simple GSON based implementation to save Objects or primitive values like in a property .ini file.
It's an easy and simple alternative to Property-Files. Download the Config.java and the GSON-Lib and feel free to edit the dummy attributes.

# Usage
```java
package de.roth.json.config;

public class Test {

	public static void main(String[] args) {
		// Load config from file
		Config.load("config.json");

		// Access attributes
		Config.getInstance().TITLE = "Neuer Titel";
		Config.getInstance().RATIO = 0.4;
		for (String s : Config.getInstance().NAMES) {
			System.out.println(s);
		}

		// And save it! - done
		Config.getInstance().toFile("config.json");
	}
}
```


# Output
Example output...
```javascript
 {
  "TITLE": "Neuer Titel",
  "WIDTH": 800,
  "HEIGHT": 600,
  "RATIO": 0.4,
  "NAMES": [
    "Peter",
    "Paul"
  ]
}
```
