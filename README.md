# catacumba-app

Example app to explain usage of catacumba

## Installation

Install dependencies using the command `lein deps`.

Launch the application using the command `lein run`.

## Usage

For example:

```sh
$ curl -i "localhost:8080"
Clojure 1.9.0 - served from /about(py2_env) kwiff-mbp-klee:echo-service klee$ curl -i "localhost:8080"
HTTP/1.1 200 OK
content-type: text/plain;charset=UTF-8
content-length: 13
set-cookie: sessionid=AAABaE-nFJG53hgFY5oSqeWkMtfT0Yajcwe4beQSgoz2KQu6hCZ_miYDktpXlUF3; Max-Age=0; Expires=Tue, 15 Jan 2019 03:56:16 GMT; Path=/; HTTPOnly

Hello World!!

$ curl -i "localhost:8080/ping"
HTTP/1.1 200 OK
content-type: text/plain;charset=UTF-8
content-length: 4
set-cookie: sessionid=AAABaE-nd9yOBW5YlZ1RWSBTNkSTU0QU94wG7_VQaBIGJd7q9-6Rb1QMx7GWYFmE; Max-Age=0; Expires=Tue, 15 Jan 2019 03:56:41 GMT; Path=/; HTTPOnly

pong
```

## License
