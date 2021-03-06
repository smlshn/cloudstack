// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package com.cloud.usage;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.cloudstack.api.InternalIdentity;

@Entity
@Table(name = "usage_snapshot_on_primary")
public class UsageSnapshotOnPrimaryVO implements InternalIdentity {

    @Column(name = "id")
    // volumeId
    private long id;

    @Column(name = "zone_id")
    private long zoneId;

    @Column(name = "account_id")
    private long accountId;

    @Column(name = "domain_id")
    private long domainId;

    @Column(name = "vm_id")
    private long vmId;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private int snapshotType;

    @Column(name = "physicalsize")
    private long physicalSize;

    @Column(name = "created")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date created = null;

    @Column(name = "deleted")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date deleted;

    @Column(name = "virtualsize")
    private Long virtualSize;

    protected UsageSnapshotOnPrimaryVO() {
    }

    public UsageSnapshotOnPrimaryVO(long id, long zoneId, long accountId, long domainId, long vmId, String name, int type, long virtualSize, long physicalSize, Date created, Date deleted) {
        this.id = id;
        this.zoneId = zoneId;
        this.accountId = accountId;
        this.domainId = domainId;
        this.snapshotType = type;
        this.physicalSize = physicalSize;
        this.virtualSize = virtualSize;
        this.created = created;
        this.vmId = vmId;
        this.name = name;
        this.deleted = deleted;
    }

    public long getZoneId() {
        return zoneId;
    }

    public long getAccountId() {
        return accountId;
    }

    public long getDomainId() {
        return domainId;
    }

    public int getSnapshotType() {
        return snapshotType;
    }

    public long getPhysicalSize() {
        return physicalSize;
    }

    public Long getVirtualSize() {
        return virtualSize;
    }

    public Date getDeleted() {
        return deleted;
    }

    public void setDeleted(Date deleted) {
        this.deleted = deleted;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public long getVmId() {
        return vmId;
    }

    public String getName() {
        return name;
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UsageSnapshotOnPrimaryVO [id=" + id + ", zoneId=" + zoneId + ", accountId=" + accountId + ", domainId=" + domainId + ", vmId=" + vmId + ", name=" + name
                + ", snapshotType=" + snapshotType + ", physicalSize=" + physicalSize + ", created=" + created + ", deleted=" + deleted + ", virtualSize=" + virtualSize + "]";
    }

}
