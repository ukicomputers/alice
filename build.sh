#!/bin/bash
set -e

mkdir -p dist/classes
cp -r resources dist/classes/
javac -cp "$ALICE3_ROOT/lib/*" -d dist/classes $(find src -name '*.java')
jar cfe dist/build.jar AliceJavaFXLauncher -C dist/classes .