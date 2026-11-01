@echo off
setlocal

set "ALICE3_ROOT=C:\Program Files\Alice 3"

"%ALICE3_ROOT%\jre\bin\java.exe" -Dorg.alice.ide.rootDirectory="%ALICE3_ROOT%" -cp "dist\build.jar;%ALICE3_ROOT%\lib\*" AliceJavaFXLauncher