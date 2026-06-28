.class public Lcom/lody/virtual/helper/MultiAvoidRecursive;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mCallings:Landroid/util/SparseBooleanArray;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x7

    .line 3
    invoke-direct {p0, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0, p1}, Landroid/util/SparseBooleanArray;-><init>(I)V

    iput-object v0, p0, Lcom/lody/virtual/helper/MultiAvoidRecursive;->mCallings:Landroid/util/SparseBooleanArray;

    return-void
.end method


# virtual methods
.method public beginCall(I)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/MultiAvoidRecursive;->mCallings:Landroid/util/SparseBooleanArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/helper/MultiAvoidRecursive;->mCallings:Landroid/util/SparseBooleanArray;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    const/4 p1, 0x0

    .line 14
    return p1

    .line 15
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/helper/MultiAvoidRecursive;->mCallings:Landroid/util/SparseBooleanArray;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {v1, p1, v2}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return v2

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p1
    .line 26
    .line 27
.end method

.method public finishCall(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/MultiAvoidRecursive;->mCallings:Landroid/util/SparseBooleanArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/helper/MultiAvoidRecursive;->mCallings:Landroid/util/SparseBooleanArray;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-virtual {v1, p1, v2}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 8
    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
