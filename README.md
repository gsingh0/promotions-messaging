# promotions-messaging

- make sure mysql instance is running
  - 'brew start service mysql'

- when talking about scale
  - mention containerizing each service and having multiple instances of each
  - mention that when theres a lot of emails, then you can integrate batch processing via GKE batch job

- security
  - simple security implementation defined
    - using basic auth assuming that there is an authentication resource that has username and passwords of all the users
    - for now use a single test user
    - in enterprise environment, need to use oauth or ldap authentication
      - oauth2:
        - client send authorization request to resource owner (user)
        - gets back an authorization grant
        - client sends auth grant to authorization server
        - gets back a token
        - client can use token to access resource server
        - get back resource data


