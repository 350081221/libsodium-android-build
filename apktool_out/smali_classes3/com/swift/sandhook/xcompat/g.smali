.class public Lcom/swift/sandhook/xcompat/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static hasStubBackup:Z = false

.field public static stubSizes:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/swift/sandhook/xcompat/g;->stubSizes:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0xa
        0x14
        0x1e
        0x1e
        0x1e
        0x1e
        0x32
        0x32
    .end array-data
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static stub_hook_0()J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {v0, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v1

    const/4 v2, 0x0

    new-array v0, v0, [J

    invoke-static {v1, v2, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_0(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 2
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    aput-wide p0, v0, v1

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_0(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 3
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    aput-wide p0, v0, v1

    const/4 p0, 0x1

    aput-wide p2, v0, p0

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_0(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x3

    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    aput-wide p0, v0, v1

    const/4 p0, 0x1

    aput-wide p2, v0, p0

    const/4 p0, 0x2

    aput-wide p4, v0, p0

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_0(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x4

    const/4 v1, 0x0

    .line 5
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    aput-wide p0, v0, v1

    const/4 p0, 0x1

    aput-wide p2, v0, p0

    const/4 p0, 0x2

    aput-wide p4, v0, p0

    const/4 p0, 0x3

    aput-wide p6, v0, p0

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_0(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x5

    const/4 v1, 0x0

    .line 6
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    aput-wide p0, v0, v1

    const/4 p0, 0x1

    aput-wide p2, v0, p0

    const/4 p0, 0x2

    aput-wide p4, v0, p0

    const/4 p0, 0x3

    aput-wide p6, v0, p0

    const/4 p0, 0x4

    aput-wide p8, v0, p0

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_0(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x6

    const/4 v1, 0x0

    .line 7
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    aput-wide p0, v0, v1

    const/4 p0, 0x1

    aput-wide p2, v0, p0

    const/4 p0, 0x2

    aput-wide p4, v0, p0

    const/4 p0, 0x3

    aput-wide p6, v0, p0

    const/4 p0, 0x4

    aput-wide p8, v0, p0

    const/4 p0, 0x5

    aput-wide p10, v0, p0

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_0(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 8
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    aput-wide p0, v0, v1

    const/4 v1, 0x1

    aput-wide p2, v0, v1

    const/4 v1, 0x2

    aput-wide p4, v0, v1

    const/4 v1, 0x3

    aput-wide p6, v0, v1

    const/4 v1, 0x4

    aput-wide p8, v0, v1

    const/4 v1, 0x5

    aput-wide p10, v0, v1

    const/4 v1, 0x6

    aput-wide p12, v0, v1

    const/4 v1, 0x0

    invoke-static {v2, v1, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_1()J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    const/4 v2, 0x0

    new-array v1, v1, [J

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_1(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x1

    .line 2
    invoke-static {v0, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v1

    new-array v0, v0, [J

    const/4 v2, 0x0

    aput-wide p0, v0, v2

    const/4 p0, 0x0

    invoke-static {v1, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_1(JJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x2

    const/4 v1, 0x1

    .line 3
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    aput-wide p2, v0, v1

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_1(JJJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x3

    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    aput-wide p2, v0, v1

    const/4 p0, 0x2

    aput-wide p4, v0, p0

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_1(JJJJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x4

    const/4 v1, 0x1

    .line 5
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    aput-wide p2, v0, v1

    const/4 p0, 0x2

    aput-wide p4, v0, p0

    const/4 p0, 0x3

    aput-wide p6, v0, p0

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_1(JJJJJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x5

    const/4 v1, 0x1

    .line 6
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    aput-wide p2, v0, v1

    const/4 p0, 0x2

    aput-wide p4, v0, p0

    const/4 p0, 0x3

    aput-wide p6, v0, p0

    const/4 p0, 0x4

    aput-wide p8, v0, p0

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_1(JJJJJJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x6

    const/4 v1, 0x1

    .line 7
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    aput-wide p2, v0, v1

    const/4 p0, 0x2

    aput-wide p4, v0, p0

    const/4 p0, 0x3

    aput-wide p6, v0, p0

    const/4 p0, 0x4

    aput-wide p8, v0, p0

    const/4 p0, 0x5

    aput-wide p10, v0, p0

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_1(JJJJJJJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x7

    const/4 v1, 0x1

    .line 8
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    aput-wide p2, v0, v1

    const/4 v1, 0x2

    aput-wide p4, v0, v1

    const/4 v1, 0x3

    aput-wide p6, v0, v1

    const/4 v1, 0x4

    aput-wide p8, v0, v1

    const/4 v1, 0x5

    aput-wide p10, v0, v1

    const/4 v1, 0x6

    aput-wide p12, v0, v1

    const/4 v1, 0x0

    invoke-static {v2, v1, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_10(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xa

    const/4 v1, 0x1

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_10(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xa

    const/4 v1, 0x2

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_10(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xa

    const/4 v1, 0x3

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_10(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xa

    const/4 v1, 0x4

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_10(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xa

    const/4 v1, 0x5

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_10(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xa

    const/4 v1, 0x6

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_10(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xa

    const/4 v1, 0x7

    .line 7
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_11(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xb

    const/4 v1, 0x1

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_11(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xb

    const/4 v1, 0x2

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_11(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xb

    const/4 v1, 0x3

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_11(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xb

    const/4 v1, 0x4

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_11(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xb

    const/4 v1, 0x5

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_11(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xb

    const/4 v1, 0x6

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_11(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xb

    const/4 v1, 0x7

    .line 7
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_12(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xc

    const/4 v1, 0x1

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_12(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xc

    const/4 v1, 0x2

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_12(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xc

    const/4 v1, 0x3

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_12(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xc

    const/4 v1, 0x4

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_12(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xc

    const/4 v1, 0x5

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_12(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xc

    const/4 v1, 0x6

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_12(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xc

    const/4 v1, 0x7

    .line 7
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_13(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xd

    const/4 v1, 0x1

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_13(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xd

    const/4 v1, 0x2

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_13(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xd

    const/4 v1, 0x3

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_13(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xd

    const/4 v1, 0x4

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_13(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xd

    const/4 v1, 0x5

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_13(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xd

    const/4 v1, 0x6

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_13(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xd

    const/4 v1, 0x7

    .line 7
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_14(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xe

    const/4 v1, 0x1

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_14(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xe

    const/4 v1, 0x2

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_14(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xe

    const/4 v1, 0x3

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_14(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xe

    const/4 v1, 0x4

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_14(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xe

    const/4 v1, 0x5

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_14(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xe

    const/4 v1, 0x6

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_14(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xe

    const/4 v1, 0x7

    .line 7
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_15(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xf

    const/4 v1, 0x1

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_15(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xf

    const/4 v1, 0x2

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_15(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xf

    const/4 v1, 0x3

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_15(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xf

    const/4 v1, 0x4

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_15(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xf

    const/4 v1, 0x5

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_15(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xf

    const/4 v1, 0x6

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_15(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0xf

    const/4 v1, 0x7

    .line 7
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_16(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x10

    const/4 v1, 0x1

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_16(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x10

    const/4 v1, 0x2

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_16(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x10

    const/4 v1, 0x3

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_16(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x10

    const/4 v1, 0x4

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_16(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x10

    const/4 v1, 0x5

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_16(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x10

    const/4 v1, 0x6

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_16(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x10

    const/4 v1, 0x7

    .line 7
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_17(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x11

    const/4 v1, 0x1

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_17(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x11

    const/4 v1, 0x2

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_17(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x11

    const/4 v1, 0x3

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_17(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x11

    const/4 v1, 0x4

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_17(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x11

    const/4 v1, 0x5

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_17(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x11

    const/4 v1, 0x6

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_17(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x11

    const/4 v1, 0x7

    .line 7
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_18(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x12

    const/4 v1, 0x1

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_18(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x12

    const/4 v1, 0x2

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_18(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x12

    const/4 v1, 0x3

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_18(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x12

    const/4 v1, 0x4

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_18(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x12

    const/4 v1, 0x5

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_18(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x12

    const/4 v1, 0x6

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_18(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x12

    const/4 v1, 0x7

    .line 7
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_19(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x13

    const/4 v1, 0x1

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_19(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x13

    const/4 v1, 0x2

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_19(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x13

    const/4 v1, 0x3

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_19(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x13

    const/4 v1, 0x4

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_19(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x13

    const/4 v1, 0x5

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_19(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x13

    const/4 v1, 0x6

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_19(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x13

    const/4 v1, 0x7

    .line 7
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_2()J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    const/4 v2, 0x0

    new-array v1, v1, [J

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_2(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x2

    const/4 v1, 0x1

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_2(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x2

    .line 3
    invoke-static {v0, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v1

    new-array v0, v0, [J

    const/4 v2, 0x0

    aput-wide p0, v0, v2

    const/4 p0, 0x1

    aput-wide p2, v0, p0

    const/4 p0, 0x0

    invoke-static {v1, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_2(JJJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x3

    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    const/4 p0, 0x1

    aput-wide p2, v0, p0

    aput-wide p4, v0, v1

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_2(JJJJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x4

    const/4 v1, 0x2

    .line 5
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    const/4 p0, 0x1

    aput-wide p2, v0, p0

    aput-wide p4, v0, v1

    const/4 p0, 0x3

    aput-wide p6, v0, p0

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_2(JJJJJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x5

    const/4 v1, 0x2

    .line 6
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    const/4 p0, 0x1

    aput-wide p2, v0, p0

    aput-wide p4, v0, v1

    const/4 p0, 0x3

    aput-wide p6, v0, p0

    const/4 p0, 0x4

    aput-wide p8, v0, p0

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_2(JJJJJJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x6

    const/4 v1, 0x2

    .line 7
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    const/4 p0, 0x1

    aput-wide p2, v0, p0

    aput-wide p4, v0, v1

    const/4 p0, 0x3

    aput-wide p6, v0, p0

    const/4 p0, 0x4

    aput-wide p8, v0, p0

    const/4 p0, 0x5

    aput-wide p10, v0, p0

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_2(JJJJJJJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x7

    const/4 v1, 0x2

    .line 8
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    const/4 v3, 0x1

    aput-wide p2, v0, v3

    aput-wide p4, v0, v1

    const/4 v1, 0x3

    aput-wide p6, v0, v1

    const/4 v1, 0x4

    aput-wide p8, v0, v1

    const/4 v1, 0x5

    aput-wide p10, v0, v1

    const/4 v1, 0x6

    aput-wide p12, v0, v1

    const/4 v1, 0x0

    invoke-static {v2, v1, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_20(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x14

    const/4 v1, 0x2

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_20(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x14

    const/4 v1, 0x3

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_20(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x14

    const/4 v1, 0x4

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_20(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x14

    const/4 v1, 0x5

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_20(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x14

    const/4 v1, 0x6

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_20(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x14

    const/4 v1, 0x7

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_21(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x15

    const/4 v1, 0x2

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_21(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x15

    const/4 v1, 0x3

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_21(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x15

    const/4 v1, 0x4

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_21(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x15

    const/4 v1, 0x5

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_21(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x15

    const/4 v1, 0x6

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_21(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x15

    const/4 v1, 0x7

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_22(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x16

    const/4 v1, 0x2

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_22(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x16

    const/4 v1, 0x3

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_22(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x16

    const/4 v1, 0x4

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_22(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x16

    const/4 v1, 0x5

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_22(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x16

    const/4 v1, 0x6

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_22(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x16

    const/4 v1, 0x7

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_23(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x17

    const/4 v1, 0x2

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_23(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x17

    const/4 v1, 0x3

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_23(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x17

    const/4 v1, 0x4

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_23(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x17

    const/4 v1, 0x5

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_23(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x17

    const/4 v1, 0x6

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_23(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x17

    const/4 v1, 0x7

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_24(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x18

    const/4 v1, 0x2

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_24(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x18

    const/4 v1, 0x3

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_24(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x18

    const/4 v1, 0x4

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_24(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x18

    const/4 v1, 0x5

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_24(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x18

    const/4 v1, 0x6

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_24(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x18

    const/4 v1, 0x7

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_25(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x19

    const/4 v1, 0x2

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_25(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x19

    const/4 v1, 0x3

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_25(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x19

    const/4 v1, 0x4

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_25(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x19

    const/4 v1, 0x5

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_25(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x19

    const/4 v1, 0x6

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_25(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x19

    const/4 v1, 0x7

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_26(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1a

    const/4 v1, 0x2

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_26(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1a

    const/4 v1, 0x3

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_26(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1a

    const/4 v1, 0x4

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_26(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1a

    const/4 v1, 0x5

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_26(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1a

    const/4 v1, 0x6

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_26(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1a

    const/4 v1, 0x7

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_27(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1b

    const/4 v1, 0x2

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_27(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1b

    const/4 v1, 0x3

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_27(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1b

    const/4 v1, 0x4

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_27(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1b

    const/4 v1, 0x5

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_27(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1b

    const/4 v1, 0x6

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_27(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1b

    const/4 v1, 0x7

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_28(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1c

    const/4 v1, 0x2

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_28(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1c

    const/4 v1, 0x3

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_28(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1c

    const/4 v1, 0x4

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_28(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1c

    const/4 v1, 0x5

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_28(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1c

    const/4 v1, 0x6

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_28(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1c

    const/4 v1, 0x7

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_29(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1d

    const/4 v1, 0x2

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_29(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1d

    const/4 v1, 0x3

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_29(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1d

    const/4 v1, 0x4

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_29(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1d

    const/4 v1, 0x5

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_29(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1d

    const/4 v1, 0x6

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_29(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1d

    const/4 v1, 0x7

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_3()J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x3

    const/4 v1, 0x0

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    const/4 v2, 0x0

    new-array v1, v1, [J

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_3(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x3

    const/4 v1, 0x1

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_3(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x3

    const/4 v1, 0x2

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_3(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x3

    .line 4
    invoke-static {v0, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v1

    new-array v0, v0, [J

    const/4 v2, 0x0

    aput-wide p0, v0, v2

    const/4 p0, 0x1

    aput-wide p2, v0, p0

    const/4 p0, 0x2

    aput-wide p4, v0, p0

    const/4 p0, 0x0

    invoke-static {v1, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_3(JJJJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x4

    const/4 v1, 0x3

    .line 5
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    const/4 p0, 0x1

    aput-wide p2, v0, p0

    const/4 p0, 0x2

    aput-wide p4, v0, p0

    aput-wide p6, v0, v1

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_3(JJJJJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x5

    const/4 v1, 0x3

    .line 6
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    const/4 p0, 0x1

    aput-wide p2, v0, p0

    const/4 p0, 0x2

    aput-wide p4, v0, p0

    aput-wide p6, v0, v1

    const/4 p0, 0x4

    aput-wide p8, v0, p0

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_3(JJJJJJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x6

    const/4 v1, 0x3

    .line 7
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    const/4 p0, 0x1

    aput-wide p2, v0, p0

    const/4 p0, 0x2

    aput-wide p4, v0, p0

    aput-wide p6, v0, v1

    const/4 p0, 0x4

    aput-wide p8, v0, p0

    const/4 p0, 0x5

    aput-wide p10, v0, p0

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_3(JJJJJJJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x7

    const/4 v1, 0x3

    .line 8
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    const/4 v3, 0x1

    aput-wide p2, v0, v3

    const/4 v3, 0x2

    aput-wide p4, v0, v3

    aput-wide p6, v0, v1

    const/4 v1, 0x4

    aput-wide p8, v0, v1

    const/4 v1, 0x5

    aput-wide p10, v0, v1

    const/4 v1, 0x6

    aput-wide p12, v0, v1

    const/4 v1, 0x0

    invoke-static {v2, v1, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_30(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1e

    const/4 v1, 0x6

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_30(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1e

    const/4 v1, 0x7

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_31(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1f

    const/4 v1, 0x6

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_31(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x1f

    const/4 v1, 0x7

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_32(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x20

    const/4 v1, 0x6

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_32(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x20

    const/4 v1, 0x7

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_33(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x21

    const/4 v1, 0x6

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_33(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x21

    const/4 v1, 0x7

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_34(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x22

    const/4 v1, 0x6

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_34(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x22

    const/4 v1, 0x7

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_35(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x23

    const/4 v1, 0x6

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_35(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x23

    const/4 v1, 0x7

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_36(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x24

    const/4 v1, 0x6

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_36(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x24

    const/4 v1, 0x7

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_37(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x25

    const/4 v1, 0x6

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_37(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x25

    const/4 v1, 0x7

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_38(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x26

    const/4 v1, 0x6

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_38(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x26

    const/4 v1, 0x7

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_39(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x27

    const/4 v1, 0x6

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_39(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x27

    const/4 v1, 0x7

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_4()J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x4

    const/4 v1, 0x0

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    const/4 v2, 0x0

    new-array v1, v1, [J

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_4(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x4

    const/4 v1, 0x1

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_4(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x4

    const/4 v1, 0x2

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_4(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x4

    const/4 v1, 0x3

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_4(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x4

    .line 5
    invoke-static {v0, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v1

    new-array v0, v0, [J

    const/4 v2, 0x0

    aput-wide p0, v0, v2

    const/4 p0, 0x1

    aput-wide p2, v0, p0

    const/4 p0, 0x2

    aput-wide p4, v0, p0

    const/4 p0, 0x3

    aput-wide p6, v0, p0

    const/4 p0, 0x0

    invoke-static {v1, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_4(JJJJJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x5

    const/4 v1, 0x4

    .line 6
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    const/4 p0, 0x1

    aput-wide p2, v0, p0

    const/4 p0, 0x2

    aput-wide p4, v0, p0

    const/4 p0, 0x3

    aput-wide p6, v0, p0

    aput-wide p8, v0, v1

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_4(JJJJJJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x6

    const/4 v1, 0x4

    .line 7
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    const/4 p0, 0x1

    aput-wide p2, v0, p0

    const/4 p0, 0x2

    aput-wide p4, v0, p0

    const/4 p0, 0x3

    aput-wide p6, v0, p0

    aput-wide p8, v0, v1

    const/4 p0, 0x5

    aput-wide p10, v0, p0

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_4(JJJJJJJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x7

    const/4 v1, 0x4

    .line 8
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    const/4 v3, 0x1

    aput-wide p2, v0, v3

    const/4 v3, 0x2

    aput-wide p4, v0, v3

    const/4 v3, 0x3

    aput-wide p6, v0, v3

    aput-wide p8, v0, v1

    const/4 v1, 0x5

    aput-wide p10, v0, v1

    const/4 v1, 0x6

    aput-wide p12, v0, v1

    const/4 v1, 0x0

    invoke-static {v2, v1, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_40(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x28

    const/4 v1, 0x6

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_40(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x28

    const/4 v1, 0x7

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_41(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x29

    const/4 v1, 0x6

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_41(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x29

    const/4 v1, 0x7

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_42(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x2a

    const/4 v1, 0x6

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_42(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x2a

    const/4 v1, 0x7

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_43(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x2b

    const/4 v1, 0x6

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_43(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x2b

    const/4 v1, 0x7

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_44(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x2c

    const/4 v1, 0x6

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_44(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x2c

    const/4 v1, 0x7

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_45(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x2d

    const/4 v1, 0x6

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_45(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x2d

    const/4 v1, 0x7

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_46(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x2e

    const/4 v1, 0x6

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_46(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x2e

    const/4 v1, 0x7

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_47(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x2f

    const/4 v1, 0x6

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_47(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x2f

    const/4 v1, 0x7

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_48(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x30

    const/4 v1, 0x6

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_48(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x30

    const/4 v1, 0x7

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_49(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x31

    const/4 v1, 0x6

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_49(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x31

    const/4 v1, 0x7

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_5()J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x5

    const/4 v1, 0x0

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    const/4 v2, 0x0

    new-array v1, v1, [J

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_5(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x5

    const/4 v1, 0x1

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_5(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x5

    const/4 v1, 0x2

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_5(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x5

    const/4 v1, 0x3

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_5(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x5

    const/4 v1, 0x4

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_5(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x5

    .line 6
    invoke-static {v0, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v1

    new-array v0, v0, [J

    const/4 v2, 0x0

    aput-wide p0, v0, v2

    const/4 p0, 0x1

    aput-wide p2, v0, p0

    const/4 p0, 0x2

    aput-wide p4, v0, p0

    const/4 p0, 0x3

    aput-wide p6, v0, p0

    const/4 p0, 0x4

    aput-wide p8, v0, p0

    const/4 p0, 0x0

    invoke-static {v1, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_5(JJJJJJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x6

    const/4 v1, 0x5

    .line 7
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    const/4 p0, 0x1

    aput-wide p2, v0, p0

    const/4 p0, 0x2

    aput-wide p4, v0, p0

    const/4 p0, 0x3

    aput-wide p6, v0, p0

    const/4 p0, 0x4

    aput-wide p8, v0, p0

    aput-wide p10, v0, v1

    const/4 p0, 0x0

    invoke-static {v2, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_5(JJJJJJJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x7

    const/4 v1, 0x5

    .line 8
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    const/4 v3, 0x1

    aput-wide p2, v0, v3

    const/4 v3, 0x2

    aput-wide p4, v0, v3

    const/4 v3, 0x3

    aput-wide p6, v0, v3

    const/4 v3, 0x4

    aput-wide p8, v0, v3

    aput-wide p10, v0, v1

    const/4 v1, 0x6

    aput-wide p12, v0, v1

    const/4 v1, 0x0

    invoke-static {v2, v1, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_6()J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x6

    const/4 v1, 0x0

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    const/4 v2, 0x0

    new-array v1, v1, [J

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_6(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x6

    const/4 v1, 0x1

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_6(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x6

    const/4 v1, 0x2

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_6(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x6

    const/4 v1, 0x3

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_6(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x6

    const/4 v1, 0x4

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_6(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x6

    const/4 v1, 0x5

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_6(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x6

    .line 7
    invoke-static {v0, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v1

    new-array v0, v0, [J

    const/4 v2, 0x0

    aput-wide p0, v0, v2

    const/4 p0, 0x1

    aput-wide p2, v0, p0

    const/4 p0, 0x2

    aput-wide p4, v0, p0

    const/4 p0, 0x3

    aput-wide p6, v0, p0

    const/4 p0, 0x4

    aput-wide p8, v0, p0

    const/4 p0, 0x5

    aput-wide p10, v0, p0

    const/4 p0, 0x0

    invoke-static {v1, p0, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_6(JJJJJJJ)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x7

    const/4 v1, 0x6

    .line 8
    invoke-static {v0, v1}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v2

    new-array v0, v0, [J

    const/4 v3, 0x0

    aput-wide p0, v0, v3

    const/4 v3, 0x1

    aput-wide p2, v0, v3

    const/4 v3, 0x2

    aput-wide p4, v0, v3

    const/4 v3, 0x3

    aput-wide p6, v0, v3

    const/4 v3, 0x4

    aput-wide p8, v0, v3

    const/4 v3, 0x5

    aput-wide p10, v0, v3

    aput-wide p12, v0, v1

    const/4 v1, 0x0

    invoke-static {v2, v1, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_7()J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    const/4 v2, 0x0

    new-array v1, v1, [J

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_7(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x7

    const/4 v1, 0x1

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_7(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x7

    const/4 v1, 0x2

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_7(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x7

    const/4 v1, 0x3

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_7(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x7

    const/4 v1, 0x4

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_7(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x7

    const/4 v1, 0x5

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_7(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x7

    const/4 v1, 0x6

    .line 7
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_7(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x7

    .line 8
    invoke-static {v0, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v1

    new-array v0, v0, [J

    const/4 v2, 0x0

    aput-wide p0, v0, v2

    const/4 v2, 0x1

    aput-wide p2, v0, v2

    const/4 v2, 0x2

    aput-wide p4, v0, v2

    const/4 v2, 0x3

    aput-wide p6, v0, v2

    const/4 v2, 0x4

    aput-wide p8, v0, v2

    const/4 v2, 0x5

    aput-wide p10, v0, v2

    const/4 v2, 0x6

    aput-wide p12, v0, v2

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_8()J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x8

    const/4 v1, 0x0

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    const/4 v2, 0x0

    new-array v1, v1, [J

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_8(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x8

    const/4 v1, 0x1

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_8(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x8

    const/4 v1, 0x2

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_8(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x8

    const/4 v1, 0x3

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_8(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x8

    const/4 v1, 0x4

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_8(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x8

    const/4 v1, 0x5

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_8(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x8

    const/4 v1, 0x6

    .line 7
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_8(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x8

    const/4 v1, 0x7

    .line 8
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_9()J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x9

    const/4 v1, 0x0

    .line 1
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    const/4 v2, 0x0

    new-array v1, v1, [J

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static stub_hook_9(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x9

    const/4 v1, 0x1

    .line 2
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_9(JJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x9

    const/4 v1, 0x2

    .line 3
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_9(JJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x9

    const/4 v1, 0x3

    .line 4
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_9(JJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x9

    const/4 v1, 0x4

    .line 5
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_9(JJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x9

    const/4 v1, 0x5

    .line 6
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_9(JJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x9

    const/4 v1, 0x6

    .line 7
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    aput-wide p2, v1, p0

    const/4 p0, 0x2

    aput-wide p4, v1, p0

    const/4 p0, 0x3

    aput-wide p6, v1, p0

    const/4 p0, 0x4

    aput-wide p8, v1, p0

    const/4 p0, 0x5

    aput-wide p10, v1, p0

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static stub_hook_9(JJJJJJJ)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/16 v0, 0x9

    const/4 v1, 0x7

    .line 8
    invoke-static {v1, v0}, Lcom/swift/sandhook/xcompat/e;->getMethodId(II)I

    move-result v0

    new-array v1, v1, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 v2, 0x1

    aput-wide p2, v1, v2

    const/4 v2, 0x2

    aput-wide p4, v1, v2

    const/4 v2, 0x3

    aput-wide p6, v1, v2

    const/4 v2, 0x4

    aput-wide p8, v1, v2

    const/4 v2, 0x5

    aput-wide p10, v1, v2

    const/4 v2, 0x6

    aput-wide p12, v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/swift/sandhook/xcompat/e;->hookBridge(ILcom/swift/sandhook/xcompat/c;[J)J

    move-result-wide v0

    return-wide v0
.end method
