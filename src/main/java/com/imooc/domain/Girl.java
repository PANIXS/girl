package com.imooc.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@NoArgsConstructor
@Getter
@Setter
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;

    private String cupSize;
    @NotNull(message = "不能为空")
    @Min(value = 10,message = "应该在上小学")
    @Max(value = 16,message = "太大了")
    private Integer age;

}
