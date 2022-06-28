package com.wyf.kprunner.application.core;

import lombok.Data;

@Data
public class CEntity<CKey> implements IEntity{

    private CKey id;

}
