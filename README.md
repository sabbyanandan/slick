```
app register --name slicksource --type source --uri maven://com.example:slick:0.0.1-SNAPSHOT
app register --name slicksink --type sink --uri maven://com.example:slick:0.0.1-SNAPSHOT

stream create fooz --definition "slicksource || slicksink :print-the-damn-data<:slicksource.send-the-damn-data :up-the-damn-data<:slicksource.send-the-damn-data" --deploy
```