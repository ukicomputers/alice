#!/bin/bash
set -e

java -Dorg.alice.ide.rootDirectory="$ALICE3_ROOT" -cp "dist/build.jar:$ALICE3_ROOT/lib/*" AliceJavaFXLauncher