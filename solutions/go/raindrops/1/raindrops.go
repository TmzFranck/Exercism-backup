package raindrops

import (
    "strings"
    "fmt"
)

func Convert(number int) string {
    var result strings.Builder
	if number % 3 == 0 {
        result.WriteString("Pling")
    }
    if number % 5 == 0 {
        result.WriteString("Plang")
    }
    if number % 7 == 0 {
        result.WriteString("Plong")
    }
    if number % 3 != 0 && number % 5 != 0 && number % 7 != 0 {
        result.WriteString(fmt.Sprintf("%d", number))
    }
    return result.String()
}
