## Micronaut XML Length Issue


```
#Failing request (remove one character of <content> value in order to get successful response)
curl -X "POST" "http://localhost:8080/demo/" \
     -H 'Content-Type: application/xml' \
     -d $'<xml>

<content>dadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassddassaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddafsaddasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadadassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddaddasasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadddadasdadadaddassddssaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddasssdsaddadasdadadaddassdaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddasdasdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadaaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddasaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadaddassdsaddadasdadadadda</content>
</xml>'

```