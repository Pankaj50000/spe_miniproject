import os

def run_maven_build():
    os.system("mvn clean install")

if __name__ == "__main__":
    run_maven_build()
