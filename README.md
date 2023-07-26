# Spring Framework Examples

## About

A few small and simple examples to demonstrate the features of Spring Framework.

### Example 1

`@Autowired` and `@Component` usage.

### Example 2

`@Service`, `@Bean` and `@Resource` usage.

### Example 3

`@Values` and environment variables usage.

### Example 4

`@RestController`, `@Repository` and `@Entity` usage.  
Full web application with data persistence in H2 file-based storage.

Use the following to insert data:

```shell
curl -v -H "Content-Type: application/json" -X POST -d '{"id":1,"name":"person user"}' http://localhost:8080/users
```
