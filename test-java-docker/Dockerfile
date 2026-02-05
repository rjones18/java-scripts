# Step 1: Use a lightweight Java runtime as the base
FROM eclipse-temurin:21-jdk-alpine

# Step 2: Create a directory inside the container for your app
WORKDIR /app

# Step 3: Copy your .java files from your computer into the container
COPY *.java .

# Step 4: Compile the code inside the container
RUN javac *.java

# Step 5: Tell the container what to do when it starts
CMD ["java", "MyFirstProgram"]