package graduation_project.smart_attendance.dto;

import graduation_project.smart_attendance.domain.AttendDate;
import graduation_project.smart_attendance.domain.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddAttendDateDto {
    private LocalDate attendDate;

    private Course course;

    public AttendDate toEntity(){
        return AttendDate.builder()
                .date(attendDate)
                .course(course)
                .build();
    }
}
