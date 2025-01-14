FROM golang:1.23.4
WORKDIR /app
COPY . .
RUN go mod tidy && go build -o order-service
EXPOSE 8082
CMD ["./order-service"]
