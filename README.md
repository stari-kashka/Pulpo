## Pages
* / - main page
* /moderator - represents moderator features
* /performer - represents performer features
* /request - a page to create new requests
* /login - custom login page
* /registration - temporary mapping; necessary for the application to work on a database without users
 ## API
 ### Department(any role)
#### /api/department
* Http method GET: to get all departments
#### /api/department/{id}
* Http method GET: to get a department by id
### Department(admin)
#### /api/admin/department
* Http method POST: to create a new department
#### /api/admin/department/{id}
* Http method PUT: to update a department
* Http method DELETE: to delete a department
 ### User(admin)
#### /api/user
* Http method GET: to get all users
* Http method POST: to create a new user
#### /api/user/{id}
* Http method GET: to get a user by id
* Http method PUT: to update a user
* Http method DELETE: to delete a user
### Role(admin)
#### /api/role
* Http method GET: to get all roles
### Status(any role)
#### /api/status
* Http method GET: to get all statuses
#### /api/status/{id}
* Http method GET: to get a status by id
### Status(admin)
### /api/admin/status
* Http method POST: to create a new status
### /api/admin/status/{id}
* Http method PUT: to update a status
* Http method DELETE: to delete a status
### Request(applicant)
#### /api/applicant/request[?status={status}&department={department}]
* Http method GET: to get all requests(or filter them by status and(or) department) which were created by a logged in user 
* Http method POST: to create a new request with logged in user as an applicant
#### /api/applicant/request/{id}
* Http method PUT: to update a request(cancel it or change description)
### Request(performer)
#### /api/performer/department/request
* Http method GET: to get all requests addressed to the department of the currently logged in user
#### /api/performer/request[?status={status}]
* Http method GET: to get all requests currently logged in user is assigned for as a performer(or filter them by status)
#### /api/performer/request/{id}
* Http method PUT: to update a request(change status, sigh up for it or change comment) 
### Request(moderator)
#### /api/moderator/request[?status={status}&department={department}]
* Http method GET: to get all requests(or filter them by status and(or) department) 
#### /api/moderator/request/{id}
* Http method PUT: to change a request(change status or update topic, description, comment or dealine)
* Http method DELETE: to delete a request
### Template(applicant)
#### /api/applicant/template?department={department}
* Http method GET: to get all temolates(or filtered by department)
### Template(moderator)
#### /api/noderator/template
* Http method GET: to get all templates
* Http method POST: to create a new template
#### /api/template/moderator/{id}
* Http method PUT: to update a template(remove it)
* Http method DELETE: to delete a template
### Typical request(applicant)
#### /api/applicant/typicalrequest[?status={status}&department={department}]
* Http method GET: to get all typical requests(or filter them by status and(or) department) which were created by a logged in user 
* Http method POST: to create a new typical request with logged in user as an applicant
#### /api/applicant/typicalrequest/{id}
* Http method PUT: to update a typical request(cancel it)
### Typical request(performer)
#### /api/performer/department/typicalrequest
* Http method GET: to get all typical requests addressed to the department of the currently logged in user
#### /api/performer/typicalrequest[?status={status}]
* Http method GET: to get all typical requests currently logged in user is assigned for as a performer(or filter them by status)
#### /api/performer/typicalrequest/{id}
* Http method PUT: to update a request(change status, sigh up for it or change comment)
### Typical request(moderator)
#### /api/moderator/typicalrequest[?status={status}&department={department}]
* Http method GET: to get all typical requests(or filter them by status and(or) department) 
#### /api/moderator/typicalrequest/{id}
* Http method DELETE: to delete a typical request
* Http method PUT: to update a typical request(change status or comment)

 ## Database
### Database schema
![Database schema](images/DB_schema_postgre.png)
 ## UI
 ### Create request (/request)
 ### Moderator interface (/moderator)
 ### Performer interface (/performer)
