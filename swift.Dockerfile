FROM amd64/swift:latest

WORKDIR /calculate_engine_swift

COPY ./ ./

RUN swift package resolve
RUN swift package update

ENTRYPOINT ["/bin/linux/calculate_engine_swift"]