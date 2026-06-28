.class public Lorg/osmdroid/views/overlay/milestones/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:J

.field private final b:J

.field private final c:D

.field private final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JJD)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    .line 6
    invoke-direct/range {v0 .. v7}, Lorg/osmdroid/views/overlay/milestones/k;-><init>(JJDLjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(JJDLjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lorg/osmdroid/views/overlay/milestones/k;->a:J

    .line 3
    iput-wide p3, p0, Lorg/osmdroid/views/overlay/milestones/k;->b:J

    .line 4
    iput-wide p5, p0, Lorg/osmdroid/views/overlay/milestones/k;->c:D

    .line 5
    iput-object p7, p0, Lorg/osmdroid/views/overlay/milestones/k;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/milestones/k;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public b()D
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/views/overlay/milestones/k;->c:D

    return-wide v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/views/overlay/milestones/k;->a:J

    return-wide v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/views/overlay/milestones/k;->b:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lorg/osmdroid/views/overlay/milestones/k;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lorg/osmdroid/views/overlay/milestones/k;->b:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lorg/osmdroid/views/overlay/milestones/k;->c:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/osmdroid/views/overlay/milestones/k;->d:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
