package org.fasttrackit.curs20.repository;


import org.fasttrackit.curs20.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

}
