# PC Co-Builder

A native Android application built in Kotlin that leverages the Gemini API to generate customized, budget-optimized PC specification lists based on user use cases.

## Overview

**PC Co-Builder** is an intuitive utility application designed to simplify the system assembly planning phase. By inputting a target budget threshold and a primary operational use case (such as high-end gaming, software development, or casual office workflows), the application constructs a tailored, context-aware prompt pipeline. This query parameter is dispatched to the Gemini API, returning an optimized list of hardware component recommendations directly within the native interface.

## Features

- **Contextual Specification Engine:** Generates highly specific component lists by mapping dynamic user parameters into an optimized, fixed Gemini API query skeleton.
- **Budget-Driven Filtering:** Tailors component selection profiles to ensure hardware options match target pricing limits without overshooting budgets.
- **Dynamic Use Case Architectures:** Adjusts hardware priority metrics automatically (e.g., favors GPU scalability for gaming vs. high core-count CPUs for virtualization tasks).
- **Clean Android Architecture:** Implements modern native UI layouts, view bindings, and network abstraction boundaries to process asynchronous AI model responses smoothly.

## Tech Stack

- **Language:** Kotlin
- **Target Platform:** Android (Native API layout structures)
- **AI Integration Framework:** Gemini API / Google AI Client SDK
- **Build Core Management:** Gradle (Kotlin DSL - `.gradle.kts`)

## Project Structure

```bash
pc_co_builder/
├── app/                       # Main application module (source code, XML views, manifests)
│   ├── src/main/java/         # Core Kotlin source files, layout bindings, and API configurations
│   └── src/main/res/          # XML interface designs, graphic strings, and values definitions
├── .gitignore                 # Filtration directives tracking IDE workspace caches
├── build.gradle.kts           # Top-level application build dependency tree configuration
├── gradle.properties          # Global properties and workspace configuration mappings
├── gradlew                    # Linux/macOS automation execution script
├── gradlew.bat                # Windows command pipeline execution script
├── README.md                  # Comprehensive workspace portfolio documentation
└── settings.gradle.kts        # Root module initialization indices
```

## Setup & Running Environments

### Prerequisites

- Android Studio (Ladybug or higher recommended)
- A valid **Gemini API Key** (obtained via Google AI Studio)

### Installation & Launch

- Clone the repository directory structure locally:

  ```bash
  git clone https://github.com
  ```

- Open **Android Studio** and import the parent root `pc-co-builder/` directory location.

- Add your API authorization properties variable inside the root `local.properties` configuration file layout:

  ```properties
  GEMINI_API_KEY=your_actual_api_key_here
  ```

- Let Gradle sync completely to download project-level dependency libraries and generate binding layers.

- Connect a physical Android test device or run an emulator runtime instance, then execute `Shift + F10` or launch via the run icon button to deploy.

## Author

H2SO4-1191 – Software Engineer
