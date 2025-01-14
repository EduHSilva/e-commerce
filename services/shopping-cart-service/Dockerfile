FROM golang:1.23.4
WORKDIR /app
COPY . .
RUN go mod tidy && go build -o shopping-cart-service
EXPOSE 8081
CMD ["./shopping-cart-service"]
