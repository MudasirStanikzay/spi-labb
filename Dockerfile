FROM openjdk:17

WORKDIR /app

COPY . .

RUN mkdir -p out && \
    javac -d out src/main/java/se/iths/impl/ServiceImpl1.java \
                src/main/java/se/iths/impl/ServiceImpl2.java \
                src/main/java/se/iths/spi/Service.java \
                src/main/java/se/iths/Main.java && \
    cp -r src/main/resources/* out/

CMD ["java", "-cp", "out", "se.iths.Main"]
