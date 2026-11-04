@echo off
setlocal

set "ALICE3_ROOT=C:\Program Files\Alice 3"

if not exist dist\classes mkdir dist\classes

xcopy /E /I /Y resources dist\classes\resources\

"%ALICE3_ROOT%\jre\bin\javac.exe" -cp "%ALICE3_ROOT%\lib\*" -sourcepath "src;src\objects;src\sceneConfig" -d dist\classes src\AliceJavaFXLauncher.java

if errorlevel 1 (
    pause
    exit
)

"%ALICE3_ROOT%\jre\bin\jar.exe" cfe dist\build.jar AliceJavaFXLauncher -C dist\classes .

if errorlevel 1 (
    pause
    exit
)
