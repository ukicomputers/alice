@echo off
setlocal

set "ALICE3_ROOT=C:\Program Files\Alice 3"

if not exist dist\classes mkdir dist\classes

xcopy /E /I /Y resources dist\classes\resources\

dir /s /b src\*.java > dist/sources.txt

"%ALICE3_ROOT%\jre\bin\javac.exe" -cp "%ALICE3_ROOT%\lib\*" -d dist\classes @dist\sources.txt

if errorlevel 1 (
    pause
    exit
)

"%ALICE3_ROOT%\jre\bin\jar.exe" cfe dist\build.jar AliceJavaFXLauncher -C dist\classes .

if errorlevel 1 (
    pause
    exit
)