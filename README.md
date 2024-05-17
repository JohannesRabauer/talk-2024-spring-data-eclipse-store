# Talk about Spring-Data-Eclipse-Store 2024
This repository contains 
* [a demo](demo/) on how to use [XDEVs Spring-Data-Eclipse-Store](https://github.com/xdev-software/spring-data-eclipse-store).
* the [presentation](presentation/presentation.pdf)
* [the live demo](live/). The finished demo code is in branch [live-demo-finished](https://github.com/JohannesRabauer/talk-2024-spring-data-eclipse-store/tree/live-demo-finished).

## Additional resources
* [Recording of Talk at JUG Bangalore](https://www.youtube.com/watch?v=OlGZ2Hr0FdA)
* Blog-Article: [Minimize Costs by Utilizing Cloud Storage with Spring-Data-Eclipse-Store](https://foojay.io/today/minimize-costs-by-utilizing-cloud-storage-with-spring-data-eclipse-store/)

## Requests for Demo
### Create new owner
```
curl --request POST --header "Content-Type: application/json" --data "{\"firstName\":\"Stevie\",\"lastName\":\"Nicks\"}" http://localhost:8080/owner
```

### Get all owners
```
curl http://localhost:8080/owner
```