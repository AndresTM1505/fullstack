package com.stockmaster.stockmaster.models.DTO;

import com.stockmaster.stockmaster.models.User;
 
public class IncidenceDTO {
 
    private Long id;
    private String category;
    private String description;
    private String priority;
    private User userCreated;
   
    public IncidenceDTO(Long id, String category, String description, String priority, User userCreated) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.priority = priority;
        this.userCreated = userCreated;
    }
   
    public String getCategory() {
        return category;
    }
    public String getDescription() {
        return description;
    }
    public String getPriority() {
        return priority;
    }
    public Long getId() {
        return id;
    }
    public User getUserCreated() {
        return userCreated;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setUserCreated(User userCreated) {
        this.userCreated = userCreated;
    }

}
