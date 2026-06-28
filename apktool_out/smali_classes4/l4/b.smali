.class public interface abstract annotation Ll4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Ll4/b;
        active = false
        createInDb = true
        generateConstructors = true
        generateGettersSetters = true
        indexes = {}
        nameInDb = ""
        protobuf = V
        schema = "default"
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->SOURCE:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract active()Z
.end method

.method public abstract createInDb()Z
.end method

.method public abstract generateConstructors()Z
.end method

.method public abstract generateGettersSetters()Z
.end method

.method public abstract indexes()[Ll4/e;
.end method

.method public abstract nameInDb()Ljava/lang/String;
.end method

.method public abstract protobuf()Ljava/lang/Class;
.end method

.method public abstract schema()Ljava/lang/String;
.end method
