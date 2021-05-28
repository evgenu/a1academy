package org.acme.getting.started;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;

@Path("/form")
@ApplicationScoped
public class ClientForm {

    @Inject
    EntityManager em;

    @POST
    @Path("/reg")
    @Produces(MediaType.TEXT_PLAIN)
    @Transactional
    public void CollectData(UserDTO user) {
	UserDTO buffer = new UserDTO();
	buffer.setName(user.name);
	buffer.setPassword(user.password);
	buffer.setEmail(user.email);
	em.persist(buffer);
    }
}
