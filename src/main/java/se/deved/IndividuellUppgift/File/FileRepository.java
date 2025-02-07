package se.deved.IndividuellUppgift.File;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.deved.IndividuellUppgift.Folder.FolderDto;
import java.util.List;

@Repository
public interface FileRepository extends JpaRepository<FileDto, Long> {
    List<FileDto> findByFolder(FolderDto folder);
    void deleteByFolderId(Long folderId);
}
