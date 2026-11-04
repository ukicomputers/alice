@echo off
setlocal

set "ALICE3_ROOT=C:\Program Files\Alice 3"
set "ALICE3_GALLERY=%USERPROFILE%\Alice3\MyGallery"

if not exist "%ALICE3_GALLERY%" mkdir "%ALICE3_GALLERY%"
xcopy /E /I /Y "models\*" "%ALICE3_GALLERY%\"

"%ALICE3_ROOT%\jre\bin\java.exe" -Dorg.alice.ide.rootDirectory="%ALICE3_ROOT%" -cp "dist\build.jar;%ALICE3_ROOT%\lib\*" AliceJavaFXLauncher